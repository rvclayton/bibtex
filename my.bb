% Local Variables:
% eval: (set-register ?b "  journal      = sosp01,\n  year         = 2001,\n  volume       = 35,\n  number       = 5,\n  pages        = \"--\",\n  month        = dec,\n")
% End:
		  
.so bibtex.header

@string{asplos04 = sigplan # " (" # pot # "Eleventh International Conference on " # asplos # ", ASPLOS XI)"}
@string{sosp01    = osr # " (" # pot # "Eighteenth" # sosp # ", SOSP '01)"}

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

@Book{sewpr,
  author       = "Matthias Felleisen and Robert Bruce Findler and Matthew Flatt",
  title        = "Semantics Engineering with {PLT Redex}",
  publisher    = "The MIT Press",
  year         = 2009,
  address      = cama,
  keywords     = "reduction semantics, language semantics",
  location     = "QA 76.73.R227 F45"
}

@Book{dhwj,
  author       = "Joe Bageant",
  title        = "Deer Hunting with Jesus",
  subtitle     = "Dispatches from America's Class War",
  publisher    = "Crown",
  year         = 2007,
  address      = nyny,
  keywords     = "working class, class war, economics, politics, virginia",
  location     = "HN 90.S6 B32 2007"
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

@Article{dsa,
  author       = "Timothy~E. Denehy and John Bent and Florentina~I. Popovici and Andrea~C. Arpaci-Dusseau and Remzi~H. Arpaci-Dusseau",
  title        = "Deconstructing storage arrays",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "59--71",
  month        = nov,
  keywords     = "storage, raid storage, statistical analysis, fingerprinting,
    reverse engineering, shear",
  abstract     = "We introduce Shear, a user-level software tool that
    characterizes RAID storage arrays.  Shear employs a set of controlled
    algorithms combined with statistical techniques to automatically determine
    the important properties of a RAID system, including the number of disks,
    chunk size, level of redundancy, and layout scheme.  We illustrate the
    correctness of Shear by running it upon numerous simulated configurations,
    and then verify its real-world applicability by running Shear on both
    software-based and hardware-based RAID systems.  Finally, we demonstrate
    the utility of Shear through three case studies.  First, we show how Shear
    can be used in a storage management environment to verify RAID construction
    and detect failures.  Second, we demonstrate how Shear can be used to
    extract detailed characteristics about the individual disks within an
    array.  Third, we show how an operating system can use Shear to
    automatically tune its storage subsystems to specific RAID
    configurations.",
  location     = "https://doi.org/10.1145/1037947.1024401",
  location     = "https://research.cs.wisc.edu/wind/Publications/shear-asplos04.ps"
}

@Article{fbdedafcc,
  author       = "Yasushi Saito and Svend Frølund and Alistair Veitch and Arif Merchant and Susan Spence",
  title        = "{FAB}: building distributed enterprise disk arrays from commodity components",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "48--58",
  month        = nov,
  keywords     = "disk storage, paxos voting, load balancing, erasure coding,
    replication, timestamping, dynamic reconfiguration, redundancy",
  abstract     = "This paper describes the design, implementation, and
    evaluation of a Federated Array of Bricks (FAB), a distributed disk array
    that provides the reliability of traditional enterprise arrays with lower
    cost and better scalability.  FAB is built from a collection of bricks,
    small storage appliances containing commodity disks, CPU, NVRAM, and
    network interface cards.  FAB deploys a new majority-voting-based algorithm
    to replicate or erasure-code logical blocks across bricks and a
    reconfiguration algorithm to move data in the background when bricks are
    added or decommissioned.  We argue that voting is practical and necessary
    for reliable, high-throughput storage systems such as FAB.  We have
    implemented a FAB prototype on a 22-node Linux cluster.  This prototype
    sustains 85MB/second of throughput for a database workload, and
    270MB/second for a bulk-read workload.  In addition, it can outperform
    traditional master-slave replication through performance decoupling and can
    handle brick failures and recoveries smoothly without disturbing client
    requests.",
  location     = "https://doi.org/10.1145/1037947.1024400"
}

@Article{haifepilotab,
  author       = "Xiaotong Zhuang and Tao Zhang and Santosh Pande",
  title        = "{HIDE}: an infrastructure for efficiently protecting information leakage on the address bus",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "72--84",
  month        = nov,
  keywords     = "secure processor, address bus leakage protection, random
    permutations, basic blocks, control flow graphs",
  abstract     = "XOM-based secure processor has recently been introduced as a
    mechanism to provide copy and tamper resistant execution.  XOM provides
    support for encryption/decryption and integrity checking.  However, neither
    XOM nor any other current approach adequately addresses the problem of
    information leakage via the address bus.  This paper shows that without
    address bus protection, the XOM model is severely crippled.  Two realistic
    attacks are shown and experiments show that 70% of the code might be
    cracked and sensitive data might be exposed leading to serious security
    breaches.Although the problem of address bus leakage has been widely
    acknowledged both in industry and academia, no practical solution has ever
    been proposed that can provide an adequate security guarantee.  The main
    reason is that the problem is very difficult to solve in practice due to
    severe performance degradation which accompanies most of the solutions.
    This paper presents an infrastructure called HIDE (Hardware-support for
    leakage-Immune Dynamic Execution) which provides a solution consisting of
    chunk-level protection with hardware support and a flexible interface which
    can be orchestrated through the proposed compiler optimization and user
    specifications that allow utilizing underlying hardware solution more
    efficiently to provide better security guarantees.Our results show that
    protecting both data and code with a high level of security guarantee is
    possible with negligible performance penalty (1.3% slowdown).", 
  location     = "https://doi.org/10.1145/1037947.1024403", 
  location     = "http://www.cs.wisc.edu/~rajwar/papers/asplos04.pdf"
}

@Article{spevdift,
  author       = "G.~Edward Suh and Jae~W. Lee and David Zhang and Srinivas Devadas",
  title        = "Secure program execution via dynamic information flow tracking",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "85--96",
  month        = nov,
  keywords     = "buffer overflow, format strings, hardware tagging, stack
    smashing, information flow analysis",
  abstract     = "We present a simple architectural mechanism called dynamic
    information flow tracking that can significantly improve the security of
    computing systems with negligible performance overhead.  Dynamic
    information flow tracking protects programs against malicious software
    attacks by identifying spurious information flows from untrusted I/O and
    restricting the usage of the spurious information.Every security attack to
    take control of a program needs to transfer the program's control to
    malevolent code.  In our approach, the operating system identifies a set of
    input channels as spurious, and the processor tracks all information flows
    from those inputs.  A broad range of attacks are effectively defeated by
    checking the use of the spurious values as instructions and pointers.Our
    protection is transparent to users or application programmers; the
    executables can be used without any modification.  Also, our scheme only
    incurs, on average, a memory overhead of 1.4% and a performance overhead of
    1.1%.", 
  location     = "https://doi.org/10.1145/1037947.1024404", 
  location     = "http://csg.csail.mit.edu/pubs/memos/Memo-467/memo-467.pdf"
}

@Article{cdmuoi,
  author       = "Jaehyuk Huh and Jichuan Chang and Doug Burger and Gurindar~S. Sohi",
  title        = "Coherence decoupling: making use of incoherence",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "97--106",
  month        = nov,
  keywords     = "coherence decoupling, speculative cache lookup, coherence
    misses, false sharing, caching protocols",
  abstract     = "This paper explores a new technique called coherence
    decoupling, which breaks a traditional cache coherence protocol into two
    protocols: a Speculative Cache Lookup (SCL) protocol and a safe, backing
    coherence protocol.  The SCL protocol produces a speculative load value,
    typically from an invalid cache line, permitting the processor to compute
    with incoherent data.  In parallel, the coherence protocol obtains the
    necessary coherence permissions and the correct value.  Eventually, the
    speculative use of the incoherent data can be verified against the coherent
    data.  Thus, coherence decoupling can greatly reduce --- if not eliminate
    --- the effects of false sharing.  Furthermore, coherence decoupling can
    also reduce latencies incurred by true sharing.  SCL protocols reduce those
    latencies by speculatively writing updates into invalid lines, thereby
    increasing the accuracy of speculation, without complicating the simple,
    underlying coherence protocol that guarantees correctness.The performance
    benefits of coherence decoupling are evaluated using a full-system
    simulator and a mix of commercial and scientific benchmarks.  Our results
    show that 40% to 90% of all coherence misses can be speculated correctly,
    and therefore their latencies partially or fully hidden.  This capability
    results in performance improvements ranging from 3% to over 16%, in most
    cases where the latencies of coherence misses have an effect on
    performance.", 
  location     = "https://doi.org/10.1145/1037947.1024406", 
  location     = "http://pages.cs.wisc.edu/~mscalar/papers/2004/asplos04-coherence-decoupling.pdf"
}

@Article{cfp,
  author       = "Srikanth~T. Srinivasan and Ravi Rajwar and Haitham Akkary and Amit Gandhi and Mike Upton",
  title        = "Continual flow pipelines",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "107--119",
  month        = nov,
  keywords     = "non-blocking, instruction window, latency tolerance, cfp,
    storage latency, instruction scheduling, register assignment, cache
    hierarchies", 
  abstract     = "Increased integration in the form of multiple processor cores
    on a single die, relatively constant die sizes, shrinking power envelopes,
    and emerging applications create a new challenge for processor architects.
    How to build a processor that provides high single-thread performance and
    enables multiple of these to be placed on the same die for high throughput
    while dynamically adapting for future applications? Conventional approaches
    for high single-thread performance rely on large and complex cores to
    sustain a large instruction window for memory tolerance, making them
    unsuitable for multi-core chips.  We present Continual Flow Pipelines (CFP)
    as a new non-blocking processor pipeline architecture that achieves the
    performance of a large instruction window without requiring cycle-critical
    structures such as the scheduler and register file to be large.  We show
    that to achieve benefits of a large instruction window, inefficiencies in
    management of both the scheduler and register file must be addressed, and
    we propose a unified solution.  The non-blocking property of CFP keeps key
    processor structures affecting cycle time and power (scheduler, register
    file), and die size (second level cache) small.  The memory
    latency-tolerant CFP core allows multiple cores on a single die while
    outperforming current processor cores for single-thread applications.", 
  location     = "https://doi.org/10.1145/1037947.1024407"
}

@Article{ssrefea,
  author       = "Rajagopalan Desikan and Simha Sethumadhavan and Doug Burger and Stephen~W. Keckler",
  title        = "Scalable selective re-execution for {EDGE} architectures",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "120--132",
  month        = nov,
  keywords     = "mis-speculation recovery, selective re-execution, dependence
    prediction, edge architectures, microarchitecture, speculation, speculative
    dataflow machines",
  abstract     = "Pipeline flushes are becoming increasingly expensive in
    modern microprocessors with large instruction windows and deep pipelines.
    Selective re-execution is a technique that can reduce the penalty of
    mis-speculations by re-executing only instructions affected by the
    mis-speculation, instead of all instructions.  In this paper we introduce a
    new selective re-execution mechanism that exploits the properties of a
    dataflow-like Explicit Data Graph Execution (EDGE) architecture to support
    efficient mis-speculation recovery, while scaling to window sizes of
    thousands of instructions with high performance.  This distributed
    selective re-execution (DSRE) protocol permits multiple speculative waves
    of computation to be traversing a dataflow graph simultaneously, with a
    commit wave propagating behind them to ensure correct execution.  We
    evaluate one application of this protocol to provide efficient recovery for
    load-store dependence speculation.  Unlike traditional dataflow
    architectures which resorted to single-assignment memory semantics, the
    DSRE protocol combines dataflow execution with speculation to enable high
    performance and conventional sequential memory semantics.  Our experiments
    show that the DSRE protocol results in an average 17% speedup over the best
    dependence predictor proposed to date, and obtains 82% of the performance
    possible with a perfect oracle directing the issue of loads.", 
  location     = "https://doi.org/10.1145/1037947.1024408", 
  location     = "https://www.cs.utexas.edu/~skeckler/pubs/asplos04.pdf"
}

@Article{dsdrdibbss,
  author       = "Christopher~R. Lumb and Richard Golding",
  title        = "{D}-{SPTF}: decentralized request distribution in brick-based storage systems",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "37--47",
  month        = nov,
  keywords     = "storage systems, brick-based storage, distributed systems,
    disk scheduling, decentralized systems, load balancing, global cache
    management",
  abstract     = "Distributed Shortest-Positioning Time First (D-SPTF) is a
    request distribution protocol for decentralized systems of storage servers.
    D-SPTF exploits high-speed interconnects to dynamically select which
    server, among those with a replica, should service each read request.  In
    doing so, it simultaneously balances load, exploits the aggregate cache
    capacity, and reduces positioning times for cache misses.  For network
    latencies expected in storage clusters (e.g., 10--200μs), D-SPTF performs
    as well as would a hypothetical centralized system with the same collection
    of CPU, cache, and disk resources.  Compared to popular decentralized
    approaches, D-SPTF achieves up to 65% higher throughput and adapts more
    cleanly to heterogenous server capabilities.", 
  location     = "https://doi.org/10.1145/1037947.1024399"
}

@Article{aulppfsn,
  author       = "Virantha Ekanayake and Clinton Kelly and Rajit Manohar",
  title        = "An ultra low-power processor for sensor networks",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "27--36",
  month        = nov,
  keywords     = "low-energy hardware, sensor networks, asynchronous circuits,
    wireless, sensor network processor, even-driven execution, picojoule
    computing",
  abstract     = "We present a novel processor architecture designed
    specifically for use in low-power wireless sensor-network nodes.  Our
    sensor network asynchronous processor (SNAP/LE) is based on an asynchronous
    data-driven 16-bit RISC core with an extremely low-power idle state, and a
    wakeup response latency on the order of tens of nanoseconds.  The processor
    instruction set is optimized for sensor-network applications, with support
    for event scheduling, pseudo-random number generation, bitfield operations,
    and radio/sensor interfaces.  SNAP/LE has a hardware event queue and event
    coprocessors, which allow the processor to avoid the overhead of operating
    system software (such as task schedulers and external interrupt servicing),
    while still providing a straightforward programming interface to the
    designer.  The processor can meet performance levels required for data
    monitoring applications while executing instructions with tens of
    picojoules of energy.We evaluate the energy consumption of SNAP/LE with
    several applications representative of the workload found in data-gathering
    wireless sensor networks.  We compare our architecture and software against
    existing platforms for sensor networks, quantifying both the software and
    hardware benefits of our approach.", 
  location     = "https://doi.org/10.1145/1037947.1024397"
}

@Article{sc2004,
  author       = "Mihai Budiu and Girish Venkataramani and Tiberiu Chelcea and Seth Copen Goldstein",
  title        = "Spatial computation",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "14--26",
  month        = nov,
  keywords     = "spatial computation, dataflow machine, application-specific
    hardware, low-power computing, hardware compilation, intermediate
    representation, superscalar architecture",
  abstract     = "This paper describes a computer architecture, Spatial
    Computation (SC), which is based on the translation of high-level language
    programs directly into hardware structures.  SC program implementations are
    completely distributed, with no centralized control.  SC circuits are
    optimized for wires at the expense of computation units.In this paper we
    investigate a particular implementation of SC: ASH (Application-Specific
    Hardware).  Under the assumption that computation is cheaper than
    communication, ASH replicates computation units to simplify interconnect,
    building a system which uses very simple, completely dedicated
    communication channels.  As a consequence, communication on the datapath
    never requires arbitration; the only arbitration required is for accessing
    memory.  ASH relies on very simple hardware primitives, using no
    associative structures, no multiported register files, no scheduling logic,
    no broadcast, and no clocks.  As a consequence, ASH hardware is fast and
    extremely power efficient.In this work we demonstrate three features of
    ASH: (1) that such architectures can be built by automatic compilation of C
    programs; (2) that distributed computation is in some respects
    fundamentally different from monolithic superscalar processors; and (3)
    that ASIC implementations of ASH use three orders of magnitude less energy
    compared to high-end superscalar processors, while being on average only
    33% slower in performance (3.5x worst-case).", 
  location     = "https://doi.org/10.1145/1037947.1024396", 
  location     = "https://acg.media.mit.edu/people/simong/thesis/SpatialComputing.pdf"
}

@Article{pwtcact,
  author       = "Lance Hammond and Brian~D. Carlstrom and Vicky Wong and Ben Hertzberg and Mike Chen and Christos Kozyrakis and Kunle Olukotun",
  title        = "Programming with transactional coherence and consistency ({TCC})",
  journal      = asplos04,
  year         = 2004,
  volume       = 39,
  number       = 11,
  pages        = "1--13",
  month        = nov,
  keywords     = "transactions, feedback optimization, multiprocessor
    architecture, parallelization",
  abstract     = "Transactional Coherence and Consistency (TCC) offers a way to
    simplify parallel programming by executing all code within transactions.
    In TCC systems, transactions serve as the fundamental unit of parallel
    work, communication and coherence.  As each transaction completes, it
    writes all of its newly produced state to shared memory atomically, while
    restarting other processors that have speculatively read stale data.  With
    this mechanism, a TCC-based system automatically handles data
    synchronization correctly, without programmer intervention.  To gain the
    benefits of TCC, programs must be decomposed into transactions.  We
    describe two basic programming language constructs for decomposing programs
    into transactions, a loop conversion syntax and a general
    transaction-forking mechanism.  With these constructs, writing correct
    parallel programs requires only small, incremental changes to correct
    sequential programs.  The performance of these programs may then easily be
    optimized, based on feedback from real program execution, using a few
    simple techniques.", 
  location     = "https://doi.org/10.1145/1037947.1024395", 
  location     = "http://csl.stanford.edu/~christos/publications/2004.tcc.asplos.slides.pdf"
}

@Article{saafwcsis,
  author       = "Matt Welsh and David Culler and Eric Brewer",
  title        = "{SEDA}: an architecture for well-conditioned, scalable internet services",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "230--243",
  month        = dec,
  keywords     = "string of pearls, event-driven architecture, pipeline
    architecture, threading, autonomic scalability",
  abstract     = "We propose a new design for highly concurrent Internet
    services, which we call the staged event-driven architecture (SEDA).  SEDA
    is intended to support massive concurrency demands and simplify the
    construction of well-conditioned services.  In SEDA, applications consist
    of a network of event-driven stages connected by explicit queues.  This
    architecture allows services to be well-conditioned to load, preventing
    resources from being overcommitted when demand exceeds service capacity.
    SEDA makes use of a set of dynamic resource controllers to keep stages
    within their operating regime despite large fluctuations in load.  We
    describe several control mechanisms for automatic tuning and load
    conditioning, including thread pool sizing, event batching, and adaptive
    load shedding.  We present the SEDA design and an implementation of an
    Internet services platform based on this architecture.  We evaluate the use
    of SEDA through two applications: a high-performance HTTP server and a
    packet router for the Gnutella peer-to-peer file sharing network.  These
    results show that SEDA applications exhibit higher performance than
    traditional service designs, and are robust to huge variations in load.", 
  location     = "https://doi.org/10.1145/502034.502057", 
  location     = "http://www.sosp.org/2001/papers/welsh.pdf"
}

@Article{barsbrunp,
  author       = "Tammo Spalink and Scott Karlin and Larry Peterson and Yitzchak Gottlieb",
  title        = "Building a robust software-based router using network processors",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "216--229",
  month        = dec,
  keywords     = "layered architecture, packet processing, network coprocessors",
  abstract     = "Recent efforts to add new services to the Internet have
    increased interest in software-based routers that are easy to extend and
    evolve.  This paper describes our experiences using emerging network
    processors---in particular, the Intel IXP1200---to implement a router.  We
    show it is possible to combine an IXP1200 development board and a PC to
    build an inexpensive router that forwards minimum-sized packets at a rate
    of 3.47Mpps.  This is nearly an order of magnitude faster than existing
    pure PC-based routers, and sufficient to support 1.77Gbps of aggregate link
    bandwidth.  At lesser aggregate line speeds, our design also allows the
    excess resources available on the IXP1200 to be used robustly for extra
    packet processing.  For example, with 8 × 100Mbps links, 240 register
    operations and 96 bytes of state storage are available for each 64-byte
    packet.  Using a hierarchical architecture we can guarantee line-speed
    forwarding rates for simple packets with the IXP1200, and still have extra
    capacity to process exceptional packets with the Pentium.  Up to 310Kpps of
    the traffic can be routed through the Pentium to receive 1510 cycles of
    extra per-packet processing.", 
  location     = "https://doi.org/10.1145/502034.502056", 
  location     = "https://people.eecs.berkeley.edu/~culler/courses/cs252-s05/papers/p216-spalink.pdf"
}

@Article{wacswc,
  author       = "Frank Dabek and M.~Frans Kaashoek and David Karger and Robert Morris and Ion Stoica",
  title        = "Wide-area cooperative storage with {CFS}",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "202--215",
  month        = dec,
  keywords     = "peer-to-peer storage, chorus, distributed block storage,
    scalability, reliability, caching",
  abstract     = "The Cooperative File System (CFS) is a new peer-to-peer
    read-only storage system that provides provable guarantees for the
    efficiency, robustness, and load-balance of file storage and retrieval.
    CFS does this with a completely decentralized architecture that can scale
    to large systems.  CFS servers provide a distributed hash table (DHash) for
    block storage.  CFS clients interpret DHash blocks as a file system.  DHash
    distributes and caches blocks at a fine granularity to achieve load
    balance, uses replication for robustness, and decreases latency with server
    selection.  DHash finds blocks using the Chord location protocol, which
    operates in time logarithmic in the number of servers.CFS is implemented
    using the SFS file system toolkit and runs on Linux, OpenBSD, and FreeBSD.
    Experience on a globally deployed prototype shows that CFS delivers data to
    clients as fast as FTP.  Controlled tests show that CFS is scalable: with
    4,096 servers, looking up a block of data involves contacting only seven
    servers.  The tests also demonstrate nearly perfect robustness and
    unimpaired performance even when as many as half the servers fail.", 
  location     = "https://doi.org/10.1145/502034.502054", 
  location     = "https://pdos.csail.mit.edu/papers/cfs:sosp01/cfs_sosp.pdf"
}

