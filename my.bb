% Local Variables:
% eval: (set-register ?b "  journal      = asplos04,\n  year         = 2004,\n  volume       = 39,\n  number       = 11,\n  pages        = \"--\",\n  month        = nov,\n")
% End:
		  
.so bibtex.header

@string{asplos04 = sigplan # " (" # pot # "Eleventh International Conference on " # asplos # ", ASPLOS XI)"}

@Book{tsbotw,
  author       = "Victor Pelevin",
  title        = "The Sacred Book of the Werewolf",
  publisher    = "Viking",
  year         = 2005,
  address      = nyny,
  keywords     = "philosophy, were-creatures, post-soviet russia",
  location     = "PG 3485.E38 S8713"
}

@Book{hps1984,
  author       = "Pamela Sargent",
  title        = "Homesmind",
  subtitle     = "The Watchstar Trilogy Book III",
  publisher    = "Harper \& Row",
  year         = 1984,
  address      = nyny,
  keywords     = "survival",
  location     = "PZ 7.S2472 Ho 1984"
}

@Article{hasfadsafes,
  author       = "John Regehr and Alastair Reid",
  title        = "{HOIST}:  {A} System for Automatically Deriving Static Analyzers for Embedded Systems",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "133--143",
  month        = nov,
  keywords     = "abstract interpretation, static analysis, program
    verification, object code, binary decision diagrams",
  abstract     = "Embedded software must meet conflicting requirements such as
    high reliability, running on resource-constrained platforms, and rapid
    development.  Static program analysis can help meet all of these goals.
    People developing analyzers for embedded object code face a difficult
    problem: writing an abstract version of each instruction in the target
    architecture(s).  This is currently done by hand, resulting in abstract
    operations that are both buggy and im-precise.  We have developed Hoist: a
    novel system that solves these problems by automatically constructing
    abstract operations using a microprocessor (or simulator) as its own
    specification.  With almost no input from a human, Hoist generates a
    collection of C functions ready to be linked into an abstract interpreter.
    We demonstrate that Hoist generates abstract operations that are correct,
    having been extensively tested, sufficiently fast, and substantially more
    precise than manually written abstract operations. Hoist is currently
    limited to eight-bit machines due to costs exponential in the word size of
    the target architecture.  It is essential to be able to analyze software
    running on these small processors: they are important and ubiquitous, with
    many embedded and safety-critical systems being based on them.",
  location     = "https://doi.org/10.1145/1037187.1024410",
  location     = "https://www.cs.utah.edu/flux/papers/hoist-asplos04.pdf"
}

@Article{htvvmoaei2pbp,
  author       = "Perry~H. Wang and Jamison~D. Collins and Hong Wang and Dongkeun Kim and Bill Greene and Kai-Ming Chan and Aamir~B. Yunus and Terry Sych and Stephen~F. Moore and John~P. Shen",
  title        = "Helper Threads via Virtual Multithreading on an Experimental {Itanium} 2 Processor-Based Platform",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "144--155",
  month        = nov,
  keywords     = "helper thread, cache miss prefetching, multithreading,
    switch-on-event, itanium processor, pal, db2 database",
  abstract     = "Helper threading is a technology to accelerate a program by
    exploiting a processor's multithreading capability to run ``assist''
    threads.  Previous experiments on hyper-threaded processors have
    demonstrated significant speedups by using helper threads to prefetch
    hard-to-predict delinquent data accesses.  In order to apply this technique
    to processors that do not have built-in hardware support for
    multithreading, we introduce virtual multithreading (VMT), a novel form of
    switch-on-event user-level multithreading, capable of fly-weight
    multiplexing of event-driven thread executions on a single processor
    without additional operating system support.  The compiler plays a key role
    in minimizing synchronization cost by judiciously partitioning register
    usage among the user-level threads.  The VMT approach makes it possible to
    launch dynamic helper thread instances in response to long-latency cache
    miss events, and to run helper threads in the shadow of cache misses when
    the main thread would be otherwise stalled.The concept of VMT is prototyped
    on an Itanium ® 2 processor using features provided by the Processor
    Abstraction Layer (PAL) firmware mechanism already present in currently
    shipping processors.  On a 4-way MP physical system equipped with
    VMT-enabled Itanium 2 processors, helper threading via the VMT mechanism
    can achieve significant performance gains for a diverse set of real-world
    workloads, ranging from single-threaded workstation benchmarks to heavily
    multithreaded large scale decision support systems (DSS) using the IBM DB2
    Universal Database.  We measure a wall-clock speedup of 5.8% to 38.5% for
    the workstation benchmarks, and 5.0% to 12.7% on DSS workload queries.",
  location     = "https://doi.org/10.1145/1037947.1024411"
}

@Article{lomlduasp,
  author       = "Matthias Hauswirth and Trishul~M. Chilimbi",
  title        = "Low-overhead memory leak detection using adaptive statistical profiling",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "156--164",
  month        = nov,
  keywords     = "low-overhead monitoring, runtime analysis, memory leaks, ",
  abstract     = "Sampling has been successfully used to identify performance
    optimization opportunities.  We would like to apply similar techniques to
    check program correctness.  Unfortunately, sampling provides poor coverage
    of infrequently executed code, where bugs often lurk.  We describe an
    adaptive profiling scheme that addresses this by sampling executions of
    code segments at a rate inversely proportional to their execution
    frequency.  To validate our ideas, we have implemented SWAT, a novel memory
    leak detection tool.  SWAT traces program allocations/ frees to construct a
    heap model and uses our adaptive profiling infrastructure to monitor
    loads/stores to these objects with low overhead.  SWAT reports stale
    objects that have not been accessed for a long time as leaks.  This
    allows it to find all leaks that manifest during the current program
    execution.  Since SWAT has low runtime overhead (‹5%), and low space
    overhead (‹10% in most cases and often less than 5%), it can be used to
    track leaks in production code that take days to manifest.  In addition to
    identifying the allocations that leak memory, SWAT exposes where the
    program last accessed the leaked data, which facilitates debugging and
    fixing the leak.  SWAT has been used by several product groups at Microsoft
    for the past 18 months and has proved effective at detecting leaks with a
    low false positive rate (‹10%).",
  location     = "https://doi.org/10.1145/1037947.1024412",
  location     = "https://www.microsoft.com/en-us/research/publication/low-overhead-memory-leak-detection-using-adaptive-statistical-profiling/"
}

@Article{lpp04,
  author       = "Xipeng Shen and Yutao Zhong and Chen Ding",
  title        = "Locality phase prediction",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "165--176",
  month        = nov,
  keywords     = "program phase analysis and prediction, phrase hierarchy,
    locality analysis and optimization, reconfigurable architecture, dynamic
    optimization",
  abstract     = "As computer memory hierarchy becomes adaptive, its
    performance increasingly depends on forecasting the dynamic program
    locality.  This paper presents a method that predicts the locality phases
    of a program by a combination of locality profiling and run-time
    prediction.  By profiling a training input, it identifies locality phases
    by sifting through all accesses to all data elements using
    variable-distance sampling, wavelet filtering, and optimal phase
    partitioning.  It then constructs a phase hierarchy through grammar
    compression.  Finally, it inserts phase markers into the program using
    binary rewriting.  When the instrumented program runs, it uses the first
    few executions of a phase to predict all its later executions.Compared with
    existing methods based on program code and execution intervals, locality
    phase prediction is unique because it uses locality profiles, and it marks
    phase boundaries in program code.  The second half of the paper presents a
    comprehensive evaluation.  It measures the accuracy and the coverage of the
    new technique and compares it with best known run-time methods.  It
    measures its benefit in adaptive cache resizing and memory remapping.
    Finally, it compares the automatic analysis with manual phase marking.  The
    results show that locality phase prediction is well suited for identifying
    large, recurring phases in complex programs.", 
  location     = "https://doi.org/10.1145/1037947.1024414", 
  location     = "http://www.cs.rochester.edu/~cding/Documents/Publications/asplos04.pdf"
}

@Article{dtopmrcfmm,
  author       = "Pin Zhou and Vivek Pandey and Jagadeesan Sundaresan and Anand Raghuraman and Yuanyuan Zhou and Sanjeev Kumar",
  title        = "Dynamic tracking of page miss ratio curve for memory management",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "177--188",
  month        = nov,
  keywords     = "memory management, power management, resource allocation",
  abstract     = "Memory can be efficiently utilized if the dynamic memory
    demands of applications can be determined and analyzed at run-time.  The
    page miss ratio curve(MRC), i.e.  page miss rate vs.  memory size curve, is
    a good performance-directed metric to serve this purpose.  However,
    dynamically tracking MRC at run time is challenging in systems with virtual
    memory because not every memory reference passes through the operating
    system (OS).This paper proposes two methods to dynamically track MRC of
    applications at run time.  The first method is using a hardware MRC monitor
    that can track MRC at fine time granularity.  Our simulation results show
    that this monitor has negligible performance and energy overheads.  The
    second method is an OS-only implementation that can track MRC at coarse
    time granularity.  Our implementation results on Linux show that it adds
    only 7--10% overhead.We have also used the dynamic MRC to guide both memory
    allocation for multiprogramming systems and memory energy management.  Our
    real system experiments on Linux with applications including Apache Web
    Server show that the MRC-directed memory allocation can speed up the
    applications' execution/response time by up to a factor of 5.86 and reduce
    the number of page faults by up to 63.1%.  Our execution-driven simulation
    results with SPEC2000 benchmarks show that the MRC-directed memory energy
    management can improve the Energy * Delay metric by 27--58% over previously
    proposed static and dynamic schemes.", 
  location     = "https://doi.org/10.1145/1037947.1024415", 
  location     = "http://opera.ucsd.edu/paper/ASPLOS04-Zhou.pdf"
}

@Article{copvsap,
  author       = "Rodric~M. Rabbah and Hariharan Sandanagobalane and Mongkol Ekpanyapong and Weng-Fai Wong",
  title        = "Compiler orchestrated prefetching via speculation and predication",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "189--198",
  month        = nov,
  keywords     = "precomputation, speculation, predicted execution, prefetching",
  abstract     = "This paper introduces a compiler orchestrated prefetching
    system as a unified framework geared toward ameliorating the gap between
    processing speeds and memory access latencies.  We focus the scope of the
    optimization on specific subsets of the program dependence graph that
    succinctly characterize the memory access pattern of both regular
    array-based applications and irregular pointer-intensive programs.  We
    illustrate how program embedded precomputation via speculative execution
    can accurately predict and effectively prefetch future memory references
    with negligible overhead.  The proposed techniques reduce the total running
    time of seven SPEC benchmarks and two OLDEN benchmarks by 27% on an Itanium
    2 processor.  The improvements are in addition to several state-of-the-art
    optimizations including software pipelining and data prefetching.  In
    addition, we use cycle-accurate simulations to identify important and
    lightweight architectural innovations that further mitigate the memory
    system bottleneck.  We focus on the notoriously challenging class of
    pointer-chasing applications, and demonstrate how they may benefit from a
    novel scheme of it sentineled prefetching.  Our results for twelve SPEC
    benchmarks demonstrate that 45% of the processor stalls that are caused by
    the memory system are avoidable.  The techniques in this paper can
    effectively mask long memory latencies with little instruction overhead,
    and can readily contribute to the performance of processors today.", 
  location     = "https://doi.org/10.1145/1037947.1024416", 
  location     = "https://cs.uwaterloo.ca/~brecht/courses/702/Possible-Readings/prefetching-to-cache/compiler-orch-via-spec-and-prefetch-p189-rabbah-apslos-2004.pdf"
}

@Article{spfmsgchaasr,
  author       = "Chen-Yong Cher and Antony~L. Hosking and T.~N. Vijaykumar",
  title        = "Software prefetching for mark-sweep garbage collection: hardware analysis and software redesign",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "199--210",
  month        = nov,
  keywords     = "cache architecture, prefetching, garbage collection,
    mark-sweep collection, prefetch-on-grey, buffered prefetch, depth-first
    sweeps, breadth-first sweeps",
  abstract     = "Tracing garbage collectors traverse references from live
    program variables, transitively tracing out the closure of live objects.
    Memory accesses incurred during tracing are essentially random: a given
    object may contain references to any other object.  Since application heaps
    are typically much larger than hardware caches, tracing results in many
    cache misses.  Technology trends will make cache misses more important, so
    tracing is a prime target for prefetching.Simulation of Java benchmarks
    running with the Boehm-De-mers-Weiser mark-sweep garbage collector for a
    projected hardware platform reveal high tracing overhead (up to 65% of
    elapsed time), and that cache misses are a problem.  Applying Boehm's
    default prefetching strategy yields improvements in execution time (16% on
    average with incremental/generational collection for GC-intensive
    benchmarks), but analysis shows that his strategy suffers from significant
    timing problems: prefetches that occur too early or too late relative to
    their matching loads.  This analysis drives development of a new
    prefetching strategy that yields up to three times the performance
    improvement of Boehm's strategy for GC-intensive benchmark (27% average
    speedup), and achieves performance close to that of perfect timing ie, few
    misses for tracing accesses) on some benchmarks.  Validating these
    simulation results with live runs on current hardware produces average
    speedup of 6% for the new strategy on GC-intensive benchmarks with a GC
    configuration that tightly controls heap growth.  In contrast, Boehm's
    default prefetching strategy is ineffective on this platform.", 
  location     = "https://doi.org/10.1145/1037947.1024417", 
  location     = "ftp://ftp.cs.purdue.edu/pub/hosking/papers/asplos04.pdf"
}

