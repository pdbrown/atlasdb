.. _background_sweep:

Background Sweep
================

.. warning::

   Background sweep is currently considered to be an experimental feature, and is disabled by default.
   If you are interested in trialling background sweep, please contact the AtlasDB team.

How Background Sweep Works
--------------------------

The Background Sweep Job works by sweeping one table at a time.
The Background Sweep Job determines which table to sweep by estimating which would be most beneficial based on I/O activity and frequency, considering the following criteria:

- The number of cells written to a table since it was last swept.
- The number of cells that were deleted the last time a table was swept.
- The number of cells that were not deleted the last time a table was swept.
- The amount of time that has passed since the it was last swept.

Configuration
-------------

The background sweeper can be enabled by setting the ``enableSweep`` property in the :ref:`AtlasDB configuration <atlas_config>` to true.
For other configuration options, see :ref:`Tunable Sweep Configuration Options<sweep_tunable_parameters>`.

Additional logging for Background Sweep
---------------------------------------

By default, the background sweeper only logs errors. If you'd like to watch the background sweeper's progress, add the following in ``atlasdb.log.properties``:

  ::

    #--------------------------------------------------------------------------------
    # Sweep Logging
    #--------------------------------------------------------------------------------

    # enable background sweep logging by setting this to 'debug'; for less verbose logging, use 'error'.
    log4j.logger.com.palantir.atlasdb.sweep.BackgroundSweeperImpl=debug, sweepAppend

    # set additivity to false to make these logs only show up in background-sweeper.log
    log4j.additivity.com.palantir.atlasdb.sweep.BackgroundSweeperImpl=false

    # configure a basic file appender
    log4j.appender.sweepAppend.layout=com.palantir.monitoring.logging.log4j.PalantirPatternLayout
    log4j.appender.sweepAppend.layout.ConversionPattern=%m%n
    log4j.appender.sweepAppend=com.palantir.util.logging.ArchivedDailyRollingFileAppender
    log4j.appender.sweepAppend.threshold=debug
    log4j.appender.sweepAppend.file=log/background-sweeper.log
    log4j.appender.sweepAppend.datePattern='.'yyyy-MM-dd
    log4j.appender.sweepAppend.maxArchivesToKeep=90

This will create a log file ``log/background-sweeper.log`` where sweep information will be logged.

Querying the Sweep Metadata Tables
----------------------------------

You can also query the Atlas table ``sweep.progress`` using Atlas Console.
``sweep.progress`` contains at most a single row detailing information for the current table the background sweeper is sweeping.
You can also query ``sweep.priority`` to get a breakdown per table of:

- ``write_count`` - Approximate number of writes to this table since the last time it was swept.

- ``last_sweep_time`` - Wall clock time the last time this table was swept.

- ``cells_deleted`` - The numbers of cells deleted last time this table was swept.

- ``cells_examined`` - The number of cells in the table total the last time this table was swept.

