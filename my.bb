.so bibtex.header

@string{asplos04 = sigplan # " (" # pot # "Eleventh International Conference on " # asplos # ", ASPLOS XI)"}
@string{asplos06 = sigplan # " (" # pot # "Twelfth International Conference on " # asplos # ", ASPLOS XII)"}
@string{sosp01    = osr # " (" # pot # "Eighteenth" # sosp # ", SOSP '01)"}
@string{oopsla86    = sigplan # " (Conference Proceedings on Object-Oriented Programming Systems, Languages And Applications, OOPSLA '86)"}

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

@Book{gsrtp,
  author       = "Thomas Pynchon",
  title        = "Gravity's Rainbow",
  publisher    = "Bantam Books",
  year         = 1974,
  address      = nyny,
  price        = "$2.50",
  keywords     = "wwii, rocketry",
  location     = ""
}

@Book{thhgnr,
  author       = "Gerald~N. Rosenberg",
  title        = "The Hollow Hope",
  subtitle     = "Can the Courts Bring About Social Change?",
  publisher    = ucp,
  year         = 2008,
  address      = chil,
  edition      = "second",
  keywords     = "u.s. courts, judicial power, social change, politics, civil
    rights, women's rights, gay rights, environment, reapportionment, criminal
    law", 
  location     = "KF 8700.R66"
}

@Book{ilitec,
  author       = "Rajiv Chandrasekaran",
  title        = "Imperial Life in the Emerald City",
  subtitle     = "Inside Iraq's Green Zone",
  publisher    = "Vintage",
  year         = 2006,
  address      = nyny,
  keywords     = "occupation, development, iraq",
  location     = "DS 79.769.C53"
}

@Book{gleh,
  author       = "Elizabeth Hand",
  title        = "Generation Loss",
  publisher    = "Small Beer Press",
  year         = 2007,
  address      = noma,
  keywords     = "art photographers, maine, ritual sacrifice",
  location     = "PS 3558.A4619 G46"
}

@Book{tuws,
  author       = "Will Storr",
  title        = "The Unpersuadables",
  subtitle     = "Adventures with the Enemies of Science",
  publisher    = "The Overlook Press",
  year         = 2014,
  address      = nyny,
  keywords     = "skepticism, fundamentalism, psi research, holocaust denial",
  location     = "Q 172.5.H47 S76"
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
    scalability, reliability, caching, distributed file systems, read-only file
    systems",
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

@Article{oopwf,
  author       = "David~A. Moon",
  title        = "Object-Oriented Programming with {Flavors}",
  journal      = oopsla86,
  year         = 1986,
  volume       = 21,
  number       = 11,
  pages        = "1--8",
  month        = nov,
  keywords     = "lisp, symbolics, object-oriented programming, generic
    functions, data structures, modularity",
  abstract     = "This paper describes Symbolics' newly redesigned
    object-oriented programming system, Flavors.  Flavors encourages program
    modularity, eases the development of large, complex programs, and provides
    high efficiency at run time.  Flavors is integrated into Lisp and the
    Symbolics program development environment.  This paper describes the
    philosophy and some of the major characteristics of Symbolics' Flavors and
    shows how the above goals are addressed.  Full details of Flavors are left
    to the programmers' manual, Reference Guide to Symbolics Common Lisp.", 
  location     = "https://doi.org/10.1145/28697.28698", 
  location     = "https://www.cs.tufts.edu/comp/150FP/archive/david-moon/flavors.pdf"
}

@Article{asadsftodiisio,
  author       = "Sitaram Iyer and Peter Druschel",
  title        = "Anticipatory scheduling: a disk scheduling framework to overcome deceptive idleness in synchronous {I}/{O}",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "117--130",
  month        = dec,
  keywords     = "",
  abstract     = "Disk schedulers in current operating systems are generally
    work-conserving, i.e., they schedule a request as soon as the previous
    request has finished.  Such schedulers often require multiple outstanding
    requests from each process to meet system-level goals of performance and
    quality of service.  Unfortunately, many common applications issue disk
    read requests in a synchronous manner, interspersing successive requests
    with short periods of computation.  The scheduler chooses the next request
    too early; this induces deceptive idleness, a condition where the scheduler
    incorrectly assumes that the last request issuing process has no further
    requests, and becomes forced to switch to a request from another process.We
    propose the anticipatory disk scheduling framework to solve this problem in
    a simple, general and transparent way, based on the non-work-conserving
    scheduling discipline.  Our FreeBSD implementation is observed to yield
    large benefits on a range of microbenchmarks and real workloads.  The
    Apache webserver delivers between 29% and 71% more throughput on a
    disk-intensive workload.  The Andrew filesystem benchmark runs faster by
    8%, due to a speedup of 54% in its read-intensive phase.  Variants of the
    TPC-B database benchmark exhibit improvements between 2% and 60%.
    Proportional-share schedulers are seen to achieve their contracts
    accurately and efficiently.", 
  location     = "https://doi.org/10.1145/502034.502046", 
  location     = "http://pdos.csail.mit.edu/6.824-2002/papers/iyer-scheduling.pdf"
}

@Article{ron,
  author       = "David Andersen and Hari Balakrishnan and Frans Kaashoek and Robert Morris",
  title        = "Resilient overlay networks",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "131--145",
  month        = dec,
  keywords     = "internet performance, failure detection, application-level
    networking, policy routing",
  abstract     = "A Resilient Overlay Network (RON) is an architecture that
    allows distributed Internet applications to detect and recover from path
    outages and periods of degraded performance within several seconds,
    improving over today's wide-area routing protocols that take at least
    several minutes to recover.  A RON is an application-layer overlay on top
    of the existing Internet routing substrate.  The RON nodes monitor the
    functioning and quality of the Internet paths among themselves, and use
    this information to decide whether to route packets directly over the
    Internet or by way of other RON nodes, optimizing application-specific
    routing metrics.Results from two sets of measurements of a working RON
    deployed at sites scattered across the Internet demonstrate the benefits of
    our architecture.  For instance, over a 64-hour sampling period in March
    2001 across a twelve-node RON, there were 32 significant outages, each
    lasting over thirty minutes, over the 132 measured paths.  RON's routing
    mechanism was able to detect, recover, and route around all of them, in
    less than twenty seconds on average, showing that its methods for fault
    detection and recovery work well at discovering alternate paths in the
    Internet.  Furthermore, RON was able to improve the loss rate, latency, or
    throughput perceived by data transfers; for example, about 5% of the
    transfers doubled their TCP throughput and 5% of our transfers saw their
    loss probability reduced by 0.05.  We found that forwarding packets via at
    most one intermediate RON node is sufficient to overcome faults and improve
    performance in most cases.  These improvements, particularly in the area of
    fault detection and recovery, demonstrate the benefits of moving some of
    the control over routing into the hands of end-systems.", 
  location     = "https://doi.org/10.1145/502034.502048", 
  location     = "http://nms.lcs.mit.edu/papers/ron-sosp2001.html"
}

@Article{measrihc,
  author       = "Jeffrey~S. Chase and Darrell~C. Anderson and Prachi~N. Thakar and Amin~M. Vahdat and Ronald~P. Doyle",
  title        = "Managing energy and server resources in hosting centers",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "103--116",
  month        = dec,
  keywords     = "energy management, resource provisioning, economic modeling,
    pricing",
  abstract     = "Internet hosting centers serve multiple service sites from a
    common hardware base.  This paper presents the design and implementation of
    an architecture for resource management in a hosting center operating
    system, with an emphasis on energy as a driving resource management issue
    for large server clusters.  The goals are to provision server resources for
    co-hosted services in a way that automatically adapts to offered load,
    improve the energy efficiency of server clusters by dynamically resizing
    the active server set, and respond to power supply disruptions or thermal
    events by degrading service in accordance with negotiated Service Level
    Agreements (SLAs).Our system is based on an economic approach to managing
    shared server resources, in which services 'bid' for resources as a
    function of delivered performance.  The system continuously monitors load
    and plans resource allotments by estimating the value of their effects on
    service performance.  A greedy resource allocation algorithm adjusts
    resource prices to balance supply and demand, allocating resources to their
    most efficient use.  A reconfigurable server switching infrastructure
    directs request traffic to the servers assigned to each service.
    Experimental results from a prototype confirm that the system adapts to
    offered load and resource availability, and can reduce server energy usage
    by 29% or more for a typical Web workload.", 
  location     = "https://doi.org/10.1145/502034.502045", 
  location     = "http://www.sosp.org/2001/papers/chase.pdf"
}

@Article{bewsnwlln,
  author       = "John Heidemann and Fabio Silva and Chalermek Intanagonwiwat and Ramesh Govindan and Deborah Estrin and Deepak Ganesan",
  title        = "Building efficient wireless sensor networks with low-level naming",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "145--159",
  month        = dec,
  keywords     = "attribute-based naming, sensor networks, in-network
    processing, directed diffusion, declarative routing",
  abstract     = "In most distributed systems, naming of nodes for low-level
    communication leverages topological location (such as node addresses) and
    is independent of any application.  In this paper, we investigate an
    emerging class of distributed systems where low-level communication does
    not rely on network topological location.  Rather, low-level communication
    is based on attributes that are external to the network topology and
    relevant to the application.  When combined with dense deployment of nodes,
    this kind of named data enables in-network processing for data aggregation,
    collaborative signal processing, and similar problems.  These approaches
    are essential for emerging applications such as sensor networks where
    resources such as bandwidth and energy are limited.  This paper is the
    first description of the software architecture that supports named data and
    in-network processing in an operational, multi-application sensor-network.
    We show that approaches such as in-network aggregation and nested queries
    can significantly affect network traffic.  In one experiment aggregation
    reduces traffic by up to 42% and nested queries reduce loss rates by 30%.
    Although aggregation has been previously studied in simulation, this paper
    demonstrates nested queries as another form of in-network processing, and
    it presents the first evaluation of these approaches over an operational
    testbed.", 
  location     = "https://doi.org/10.1145/502034.502049"
}

@Article{mbcrux,
  author       = "Alex~C. Snoeren and Kenneth Conley and David~K. Gifford",
  title        = "Mesh-based content routing using {XML}",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "160--173",
  month        = dec,
  keywords     = "overlay networks, mesh networks, routing, xml",
  abstract     = "We have developed a new approach for reliably multicasting
    time-critical data to heterogeneous clients over mesh-based overlay
    networks.  To facilitate intelligent content pruning, data streams are
    comprised of a sequence of XML packets and forwarded by application-level
    XML routers.  XML routers perform content-based routing of individual XML
    packets to other routers or clients based upon queries that describe the
    information needs of downstream nodes.  Our PC-based XML router prototype
    can route an 18 Mbit per second XML stream.Our routers use a novel
    Diversity Control Protocol (DCP) for router-to-router and router-to-client
    communication.  DCP reassembles a received stream of packets from one or
    more senders using the first copy of a packet to arrive from any sender.
    When each node is connected to n parents, the resulting network is
    resilient to (n − 1) router or independent link failures without repair.
    Associated mesh algorithms permit the system to recover to (n − 1)
    resilience after node and/or link failure.  We have deployed a distributed
    network of XML routers that streams real-time air traffic control data.
    Experimental results show multiple senders improve reliability and latency
    when compared to tree-based networks.", 
  location     = "https://doi.org/10.1145/502034.502050", 
  location     = "http://cseweb.ucsd.edu/~snoeren/papers/xml-sosp01.pdf"
}

@Article{albnfs,
  author       = "Athicha Muthitacharoen and Benjie Chen and David Mazi{\` e}res",
  title        = "{A} low-bandwidth network file system",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "174--187",
  month        = dec,
  keywords     = "redundancy, hash coding, file systems, low-bandwidth networks",
  abstract     = "Users rarely consider running network file systems over slow
    or wide-area networks, as the performance would be unacceptable and the
    bandwidth consumption too high.  Nonetheless, efficient remote file access
    would often be desirable over such networks---particularly when high
    latency makes remote login sessions unresponsive.  Rather than run
    interactive programs such as editors remotely, users could run the programs
    locally and manipulate remote files through the file system.  To do so,
    however, would require a network file system that consumes less bandwidth
    than most current file systems.This paper presents LBFS, a network file
    system designed for low-bandwidth networks.  LBFS exploits similarities
    between files or versions of the same file to save bandwidth.  It avoids
    sending data over the network when the same data can already be found in
    the server's file system or the client's cache.  Using this technique in
    conjunction with conventional compression and caching, LBFS consumes over
    an order of magnitude less bandwidth than traditional network file systems
    on common workloads.", 
  location     = "https://doi.org/10.1145/502034.502052", 
  location     = "https://pdos.csail.mit.edu/papers/lbfs:sosp01/lbfs.pdf"
}

@Article{smacipalspptpsu,
  author       = "Antony Rowstron and Peter Druschel",
  title        = "Storage management and caching in {PAST}, a large-scale, persistent peer-to-peer storage utility",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "188--201",
  month        = dec,
  keywords     = "pastry, storage management, hash routing, replica management,
    caching, peer-to-peer systems",
  abstract     = "This paper presents and evaluates the storage management and
    caching in PAST, a large-scale peer-to-peer persistent storage utility.
    PAST is based on a self-organizing, Internet-based overlay network of
    storage nodes that cooperatively route file queries, store multiple
    replicas of files, and cache additional copies of popular files.In the PAST
    system, storage nodes and files are each assigned uniformly distributed
    identifiers, and replicas of a file are stored at nodes whose identifier
    matches most closely the file's identifier.  This statistical assignment of
    files to storage nodes approximately balances the number of files stored on
    each node.  However, non-uniform storage node capacities and file sizes
    require more explicit storage load balancing to permit graceful behavior
    under high global storage utilization; likewise, non-uniform popularity of
    files requires caching to minimize fetch distance and to balance the query
    load.We present and evaluate PAST, with an emphasis on its storage
    management and caching system.  Extensive trace-driven experiments show
    that the system minimizes fetch distance, that it balances the query load
    for popular files, and that it displays graceful degradation of performance
    as the global storage utilization increases beyond 95%.", 
  location     = "https://doi.org/10.1145/502034.502053", 
  location     = "http://www.cs.cornell.edu/People/egs/615/past.pdf"
}

@Article{rtdvsflpeos,
  author       = "Padmanabhan Pillai and Kang~G. Shin",
  title        = "Real-time dynamic voltage scaling for low-power embedded operating systems",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "89--102",
  month        = dec,
  keywords     = "voltage scaling, power management",
  abstract     = "In recent years, there has been a rapid and wide spread of
    non-traditional computing platforms, especially mobile and portable
    computing devices.  As applications become increasingly sophisticated and
    processing power increases, the most serious limitation on these devices is
    the available battery life.  Dynamic Voltage Scaling (DVS) has been a key
    technique in exploiting the hardware characteristics of processors to
    reduce energy dissipation by lowering the supply voltage and operating
    frequency.  The DVS algorithms are shown to be able to make dramatic energy
    savings while providing the necessary peak computation power in
    general-purpose systems.  However, for a large class of applications in
    embedded real-time systems like cellular phones and camcorders, the
    variable operating frequency interferes with their deadline guarantee
    mechanisms, and DVS in this context, despite its growing importance, is
    largely overlooked/under-developed.  To provide real-time guarantees, DVS
    must consider deadlines and periodicity of real-time tasks, requiring
    integration with the real-time scheduler.  In this paper, we present a
    class of novel algorithms called real-time DVS (RT-DVS) that modify the
    OS's real-time scheduler and task management service to provide significant
    energy savings while maintaining real-time deadline guarantees.  We show
    through simulations and a working prototype implementation that these
    RT-DVS algorithms closely approach the theoretical lower bound on energy
    consumption, and can easily reduce energy consumption 20% to 40% in an
    embedded real-time system.", 
  location     = "https://doi.org/10.1145/502034.502044", 
  location     = "http://www.sosp.org/2001/papers/pillai.pdf"
}

@Article{aesoose,
  author       = "Andy Chou and Junfeng Yang and Benjamin Chelf and Seth Hallem and Dawson Engler",
  title        = "An empirical study of operating systems errors",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "73--88",
  month        = dec,
  keywords     = "error discovery, statistical analysis, error cliches, error
    metrics", 
  abstract     = "We present a study of operating system errors found by
    automatic, static, compiler analysis applied to the Linux and OpenBSD
    kernels.  Our approach differs from previous studies that consider errors
    found by manual inspection of logs, testing, and surveys because static
    analysis is applied uniformly to the entire kernel source, though our
    approach necessarily considers a less comprehensive variety of errors than
    previous studies.  In addition, automation allows us to track errors over
    multiple versions of the kernel source to estimate how long errors remain
    in the system before they are fixed.We found that device drivers have error
    rates up to three to seven times higher than the rest of the kernel.  We
    found that the largest quartile of functions have error rates two to six
    times higher than the smallest quartile.  We found that the newest quartile
    of files have error rates up to twice that of the oldest quartile, which
    provides evidence that code 'hardens' over time.  Finally, we found that
    bugs remain in the Linux kernel an average of 1.8 years before being
    fixed.", 
  location     = "https://doi.org/10.1145/502034.502042", 
  location     = "https://pdos.csail.mit.edu/archive/6.097/readings/osbugs.pdf"
}

@Article{badbagatieisc,
  author       = "Dawson Engler and David Yu Chen and Seth Hallem and Andy Chou and Benjamin Chelf",
  title        = "Bugs as deviant behavior: a general approach to inferring errors in systems code",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "57--72",
  month        = dec,
  keywords     = "static analysis, statistical sorting, error analysis",
  abstract     = "A major obstacle to finding program errors in a real system
    is knowing what correctness rules the system must obey.  These rules are
    often undocumented or specified in an ad hoc manner.  This paper
    demonstrates techniques that automatically extract such checking
    information from the source code itself, rather than the programmer,
    thereby avoiding the need for a priori knowledge of system rules.The
    cornerstone of our approach is inferring programmer 'beliefs' that we then
    cross-check for contradictions.  Beliefs are facts implied by code: a
    dereference of a pointer, p, implies a belief that p is non-null, a call to
    'unlock(1)' implies that 1 was locked, etc.  For beliefs we know the
    programmer must hold, such as the pointer dereference above, we immediately
    flag contradictions as errors.  For beliefs that the programmer may hold,
    we can assume these beliefs hold and use a statistical analysis to rank the
    resulting errors from most to least likely.  For example, a call to
    'spin_lock' followed once by a call to 'spin_unlock' implies that the
    programmer may have paired these calls by coincidence.  If the pairing
    happens 999 out of 1000 times, though, then it is probably a valid belief
    and the sole deviation a probable error.  The key feature of this approach
    is that it requires no a priori knowledge of truth: if two beliefs
    contradict, we know that one is an error without knowing what the correct
    belief is.Conceptually, our checkers extract beliefs by tailoring rule
    'templates' to a system --- for example, finding all functions that fit the
    rule template 'a must be paired with b.' We have developed six checkers
    that follow this conceptual framework.  They find hundreds of bugs in real
    systems such as Linux and OpenBSD.  From our experience, they give a
    dramatic reduction in the manual effort needed to check a large system.
    Compared to our previous work [9], these template checkers find ten to one
    hundred times more rule instances and derive properties we found
    impractical to specify manually.", 
  location     = "https://doi.org/10.1145/502034.502041", 
  location     = "https://web.stanford.edu/~engler/deviant-sosp-01.pdf"
}

@Article{iacigbs,
  author       = "Andrea~C. Arpaci-Dusseau and Remzi~H. Arpaci-Dusseau",
  title        = "Information and control in gray-box systems",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "43--56",
  month        = dec,
  keywords     = "experimentation, file-cache management, disk layouts,
    admission control",
  abstract     = "In modern systems, developers are often unable to modify the
    underlying operating system.  To build services in such an environment, we
    advocate the use of gray-box techniques.  When treating the operating
    system as a gray-box, one recognizes that not changing the OS restricts,
    but does not completely obviate, both the information one can acquire about
    the internal state of the OS and the control one can impose on the OS.  In
    this paper, we develop and investigate three gray-box Information and
    Control Layers (ICLs) for determining the contents of the file-cache,
    controlling the layout of files across local disk, and limiting process
    execution based on available memory.  A gray-box ICL sits between a client
    and the OS and uses a combination of algorithmic knowledge, observations,
    and inferences to garner information about or control the behavior of a
    gray-box system.  We summarize a set of techniques that are helpful in
    building gray-box ICLs and have begun to organize a 'gray toolbox' to ease
    the construction of ICLs.  Through our case studies, we demonstrate the
    utility of gray-box techniques, by implementing three useful 'OS-like'
    services without the modification of a single line of OS source code.", 
  location     = "https://doi.org/10.1145/502034.502040", 
  location     = "http://www.sosp.org/2001/papers/arpacidusseau.pdf"
}

@Article{tcaloafrs,
  author       = "Haifeng Yu and Amin Vahdat",
  title        = "The costs and limits of availability for replicated services",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "29--42",
  month        = dec,
  keywords     = "replication, performance, availability",
  abstract     = "As raw system and network performance continues to improve at
    exponential rates, the utility of many services is increasingly limited by
    availability rather than performance.  A key approach to improving
    availability involves replicating the service across multiple, wide-area
    sites.  However, replication introduces well-known tradeoffs between
    service consistency and availability.  Thus, this paper explores the
    benefits of dynamically trading consistency for availability using a
    continuous consistency model.  In this model, applications specify a
    maximum deviation from strong consistency on a per-replica basis.  In this
    paper, we: i) evaluate availability of a prototype replication system
    running across the Internet as a function of consistency level, consistency
    protocol, and failure characteristics, ii) demonstrate that simple
    optimizations to existing consistency protocols result in significant
    availability improvements (more than an order of magnitude in some
    scenarios), iii) use our experience with these optimizations to prove tight
    upper bounds on the availability of services, and iv) show that maximizing
    availability typically entails remaining as close to strong consistency as
    possible during times of good connectivity, resulting in a communication
    versus availability trade-off.", 
  location     = "https://doi.org/10.1145/502034.502038", 
  location     = "https://users.cs.duke.edu/~vahdat/ps/tr-cs-2001-03.pdf"
}

@Article{buatift,
  author       = "Rodrigo Rodrigues and Miguel Castro and Barbara Liskov",
  title        = "{BASE}: using abstraction to improve fault tolerance",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "15--28",
  month        = dec,
  keywords     = "Byzantine fault tolerance, middleware, abstraction",
  abstract     = "Software errors are a major cause of outages and they are
    increasingly exploited in malicious attacks.  Byzantine fault tolerance
    allows replicated systems to mask some software errors but it is expensive
    to deploy.  This paper describes a replication technique, BASE, which uses
    abstraction to reduce the cost of Byzantine fault tolerance and to improve
    its ability to mask software errors.  BASE reduces cost because it enables
    reuse of off-the-shelf service implementations.  It improves availability
    because each replica can be repaired periodically using an abstract view of
    the state stored by correct replicas, and because each replica can run
    distinct or non-deterministic service implementations, which reduces the
    probability of common mode failures.  We built an NFS service where each
    replica can run a different off-the-shelf file system implementation, and
    an object-oriented database where the replicas ran the same,
    non-deterministic implementation.  These examples suggest that our
    technique can be used in practice --- in both cases, the implementation
    required only a modest amount of new code, and our performance results
    indicate that the replicated services perform comparably to the
    implementations that they reuse.", 
  location     = "https://doi.org/10.1145/502034.502037", 
  location     = "http://www.cs.cornell.edu/People/egs/cornellonly/syslunch/fall01/sosp/rodrigues.pdf"
}

@Article{uhacspp,
  author       = "Steve Zdancewic and Lantian Zheng and Nathaniel Nystrom and Andrew~C. Myers",
  title        = "Untrusted hosts and confidentiality: secure program partitioning",
  journal      = sosp01,
  year         = 2001,
  volume       = 35,
  number       = 5,
  pages        = "1--14",
  month        = dec,
  keywords     = "security annotations, program partitioning, information flow,
    control transfer",
  abstract     = "This paper presents secure program partitioning, a
    language-based technique for protecting confidential data during
    computation in distributed systems containing mutually untrusted hosts.
    Confidentiality and integrity policies can be expressed by annotating
    programs with security types that constrain information flow; these
    programs can then be partitioned automatically to run securely on
    heterogeneously trusted hosts.  The resulting communicating subprograms
    collectively implement the original program, yet the system as a whole
    satisfies the security requirements of participating principals without
    requiring a universally trusted host machine.  The experience in applying
    this methodology and the performance of the resulting distributed code
    suggest that this is a promising way to obtain secure distributed
    computation.", 
  location     = "https://doi.org/10.1145/502034.502036", 
  location     = "https://www.cs.cornell.edu/andru/papers/sosp01/zznm01.pdf"
}

@Article{upbtm,
  author       = "Weihaw Chuang and Satish Narayanasamy and Ganesh Venkatesh and Jack Sampson and Michael Van Biesbrouck and Gilles Pokam and Brad Calder and Osvaldo Colavin",
  title        = "Unbounded Page-Based Transactional Memory",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "347--358",
  month        = oct,
  keywords     = "transactions, transactional memory, parallel programming,
    concurrency, virtual memory, transactional hardware",
  abstract     = "Exploiting thread level parallelism is paramount in the
    multicore era.  Transactions enable programmers to expose such parallelism
    by greatly simplifying the multi-threaded programming model.  Virtualized
    transactions (unbounded in space and time) are desirable, as they can
    increase the scope of transactions' use, and thereby further simplify a
    programmer's job.  However, hardware support is essential to support
    efficient execution of unbounded transactions.  In this paper, we introduce
    Page-based Transactional Memory to support unbounded transactions.  We
    combine transaction bookkeeping with the virtual memory system to support
    fast transaction conflict detection, commit, abort, and to maintain
    transactions' speculative data.", 
  location     = "https://doi.org/10.1145/1168919.1168901",
  location     = "https://cseweb.ucsd.edu/~calder/papers/ASPLOS-06-PTM.pdf"
}

@Article{sntmil,
  author       = "Michelle~J. Moravan and Jayaram Bobba and Kevin~E. Moore and Luke Yen and Mark~D. Hill and Ben Liblit and Michael~M. Swift and David~A. Wood",
  title        = "Supporting nested transactional memory in {LogTM}",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "359--370",
  month        = nov,
  keywords     = "nested transactions, transactional storage, composition,
    partial aborts, open nesting, escaping actions, concurrency",
  abstract     = "Nested transactional memory (TM) facilitates software
    composition by letting one module invoke another without either knowing
    whether the other uses transactions.  Closed nested transactions extend
    isolation of an inner transaction until the toplevel transaction commits.
    Implementations may flatten nested transactions into the top-level one,
    resulting in a complete abort on conflict, or allow partial abort of inner
    transactions.  Open nested transactions allow a committing inner
    transaction to immediately release isolation, which increases parallelism
    and expressiveness at the cost of both software and hardware
    complexity.This paper extends the recently-proposed flat Log-based
    Transactional Memory (LogTM) with nested transactions.  Flat LogTM saves
    pre-transaction values in a log, detects conflicts with read (R) and write
    (W) bits per cache block, and, on abort, invokes a software handler to
    unroll the log.  Nested LogTM supports nesting by segmenting the log into a
    stack of activation records and modestly replicating R/W bits.  To
    facilitate composition with nontransactional code, such as language runtime
    and operating system services, we propose escape actions that allow trusted
    code to run outside the confines of the transactional memory system.", 
  location     = "https://doi.org/10.1145/1168857.1168902", 
  location     = "https://research.cs.wisc.edu/multifacet/papers/asplos06_nested_logtm.pdf"
}

@Article{titmv,
  author       = "JaeWoong Chung and Chi Cao Minh and Austen McDonald and Travis Skare and Hassan Chafi and Brian~D. Carlstrom and Christos Kozyrakis and Kunle Olukotun",
  title        = "Tradeoffs in transactional memory virtualization",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "371--381",
  month        = nov,
  keywords     = "chip multi-processors, os support, transactional memory,
    virtualization, virtualization",
  abstract     = "For transactional memory (TM) to achieve widespread
    acceptance, transactions should not be limited to the physical resources of
    any specific hardware implementation.  TM systems should guarantee correct
    execution even when transactions exceed scheduling quanta, overflow the
    capacity of hardware caches and physical memory, or include more
    independent nesting levels than what is supported in hardware.  Existing
    proposals for TM virtualization are either incomplete or rely on complex
    hardware implementations, which are an overkill if virtualization is
    invoked infrequently in the common case.We present eXtended Transactional
    Memory (XTM), the first TM virtualization system that virtualizes all
    aspects of transactional execution (time, space, and nesting depth).  XTM
    is implemented in software using virtual memory support.  It operates at
    page granularity, using private copies of overflowed pages to buffer memory
    updates until the transaction commits and snapshots of pages to detect
    interference between transactions.  We also describe two enhancements to
    XTM that use limited hardware support to address key performance
    bottlenecks.We compare XTM to hardwarebased virtualization using both real
    applications and synthetic microbenchmarks.  We show that despite being
    software-based, XTM and its enhancements are competitive with
    hardware-based alternatives.  Overall, we demonstrate that XTM provides a
    complete, flexible, and low-cost mechanism for practical TM
    virtualization.", 
  location     = "https://doi.org/10.1145/1168857.1168903", 
  location     = "http://csl.stanford.edu/~christos/publications/2006.tm_virtualization.asplos.pdf"
}

@Article{anirffehai,
  author       = "Motohiro Kawahito and Hideaki Komatsu and Takao Moriyama and Hiroshi Inoue and Toshio Nakatani",
  title        = "A new idiom recognition framework for exploiting hardware-assist instructions",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "382--393",
  month        = nov,
  keywords     = "idiom recognition, hardware-assist instructions, vmx,
    topological embedding, java, jits, code improvements, graph matching",
  abstract     = "Modern processors support hardware-assist instructions (such
    as TRT and TROT instructions on IBM zSeries) to accelerate certain
    functions such as delimiter search and character conversion.  Such special
    instructions have often been used in high performance libraries, but they
    have not been exploited well in optimizing compilers except for some
    limited cases.  We propose a new idiom recognition technique derived from a
    topological embedding algorithm [4] to detect idiom patterns in the input
    program more aggressively than in previous approaches.  Our approach can
    detect a pattern even if the code segment does not exactly match the idiom.
    For example, we can detect a code segment that includes additional code
    within the idiom pattern.  We implemented our new idiom recognition
    approach based on the Java Just-In-Time (JIT) compiler that is part of the
    J9 Java Virtual Machine, and we supported several important idioms for
    special hardware-assist instructions on the IBM zSeries and on some models
    of the IBM pSeries.  To demonstrate the effectiveness of our technique, we
    performed two experiments.  The first one is to see how many more patterns
    we can detect compared to the previous approach.  The second one is to see
    how much performance improvement we can achieve over the previous approach.
    For the first experiment, we used the Java Compatibility Kit (JCK) API
    tests.  For the second one we used IBM XML parser, SPECjvm98, and
    SPCjbb2000.  In summary, relative to a baseline implementation using exact
    pattern matching, our algorithm converted 75% more loops in JCK tests.  We
    also observed significant performance improvement of the XML parser by 64%,
    of SPECjvm98 by 1%, and of SPECjbb2000 by 2% on average on a z990.
    Finally, we observed the JIT compilation time increases by only 0.32% to
    0.44%.", 
  location     = "https://doi.org/10.1145/1168857.1168905"
}

@Article{agops,
  author       = "Sorav Bansal and Alex Aiken",
  title        = "Automatic generation of peephole superoptimizers",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "394--403",
  month        = nov,
  keywords     = "superoptimization, peephole optimization, code selection,
    searching, satisfiability solvers",
  abstract     = "Peephole optimizers are typically constructed using
    human-written pattern matching rules, an approach that requires expertise
    and time, as well as being less than systematic at exploiting all
    opportunities for optimization.  We explore fully automatic construction of
    peephole optimizers using brute force superoptimization.  While the
    optimizations discovered by our automatic system may be less general than
    human-written counterparts, our approach has the potential to automatically
    learn a database of thousands to millions of optimizations, in contrast to
    the hundreds found in current peephole optimizers.  We show experimentally
    that our optimizer is able to exploit performance opportunities not found
    by existing compilers; in particular, we show speedups from 1.7 to a factor
    of 10 on some compute intensive kernels over a conventional optimizing
    compiler.", 
  location     = "https://doi.org/10.1145/1168857.1168906", 
  location     = "https://theory.stanford.edu/~aiken/publications/papers/asplos06.pdf"
}

@Article{csffp,
  author       = "Armando Solar-Lezama and Liviu Tancau and Rastislav Bodik and Sanjit Seshia and Vijay Saraswat",
  title        = "Combinatorial sketching for finite programs",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "404--415",
  month        = nov,
  keywords     = "sketching, sat, program generation, template programming,
    code synthesis",
  abstract     = "Sketching is a software synthesis approach where the
    programmer develops a partial implementation - a sketch - and a separate
    specification of the desired functionality.  The synthesizer then completes
    the sketch to behave like the specification.  The correctness of the
    synthesized implementation is guaranteed by the compiler, which allows,
    among other benefits, rapid development of highly tuned implementations
    without the fear of introducing bugs.We develop SKETCH, a language for
    finite programs with linguistic support for sketching.  Finite programs
    include many highperformance kernels, including cryptocodes.  In contrast
    to prior synthesizers, which had to be equipped with domain-specific rules,
    SKETCH completes sketches by means of a combinatorial search based on
    generalized boolean satisfiability.  Consequently, our combinatorial
    synthesizer is complete for the class of finite programs: it is guaranteed
    to complete any sketch in theory, and in practice has scaled to realistic
    programming problems.Freed from domain rules, we can now write sketches as
    simpleto-understand partial programs, which are regular programs in which
    difficult code fragments are replaced with holes to be filled by the
    synthesizer.  Holes may stand for index expressions, lookup tables, or
    bitmasks, but the programmer can easily define new kinds of holes using a
    single versatile synthesis operator.We have used SKETCH to synthesize an
    efficient implementation of the AES cipher standard.  The synthesizer
    produces the most complex part of the implementation and runs in about an
    hour.", 
  location     = "https://doi.org/10.1145/1168857.1168907", 
  location     = "https://wiki.epfl.ch/edicpublic/documents/Candidacy%20exam/combinatorial_sketching.pdf"
}

@Article{appafso,
  author       = "Jeff {Da Silva} and J.~Gregory Steffan",
  title        = "{A} probabilistic pointer analysis for speculative optimizations",
  journal      = asplos06,
  year         = 2006,
  volume       = 41,
  number       = 11,
  pages        = "416--425",
  month        = nov,
  keywords     = "dependence analysis, pointer analysis, speculative
    optimization",
  abstract     = "Pointer analysis is a critical compiler analysis used to
    disambiguate the indirect memory references that result from the use of
    pointers and pointer-based data structures.  A conventional pointer
    analysis deduces for every pair of pointers, at any program point, whether
    a points-to relation between them (i) definitely exists, (ii) definitely
    does not exist, or (iii) maybe exists.  Many compiler optimizations rely on
    accurate pointer analysis, and to ensure correctness cannot optimize in the
    maybe case.  In contrast, recently-proposed speculative optimizations can
    aggressively exploit the maybe case, especially if the likelihood that two
    pointers alias can be quantified.  This paper proposes a Probabilistic
    Pointer Analysis (PPA) algorithm that statically predicts the probability
    of each points-to relation at every program point.  Building on simple
    control-flow edge profiling, our analysis is both one-level context and
    flow sensitive-yet can still scale to large programs including the SPEC
    2000 integer benchmark suite.  The key to our approach is to compute
    points-to probabilities through the use of linear transfer functions that
    are efficiently encoded as sparse matrices.We demonstrate that our analysis
    can provide accurate probabilities, even without edge-profile information.
    We also find that-even without considering probability information-our
    analysis provides an accurate approach to performing pointer analysis.", 
  location     = "https://doi.org/10.1145/1168857.1168908"
}

% Local Variables:
% eval: (set-register ?b "  journal      = asplos06,\n  year         = 2006,\n  volume       = 41,\n  number       = 11,\n  pages        = \"--\",\n  month        = oct,\n")
% End:
