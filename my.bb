.so bibtex.header
		  
@Article{tpspafdolp,
  author       = "Moriconi, Mark and Hare, Dwight~F.",
  title        = "The {PegaSys} System:  Pictures as Formal Documentation of Large Programs",
  journal      = toplas,
  year         = 1986,
  volume       = 8,
  number       = 4,
  pages        = "524--546",
  month        = oct,
  keywords     = "design, documentation, theory, verification, ada, data and
    control dependencies, design hierarchy, graphical formalism, mechanical
    design procedure, programming in the large",
  abstract     = "PegsSys is an experimental system in which a user formally
    describes how a program is put together by means of a hierarchically
    structured collection of pictures, called formal dependency diagrams
    (FDDs).  Icons in an FDD denote a wide range of data and control
    dependencies among the relatively coarse-grained entities contained in
    large programs.  Dependencies considered atomic with respect to one level
    in a hierarchy can be decomposed into a number of dependencies at a lower
    level.  Each dependency can be a predefined primitive of the FDD language
    or it can be defined by a PegaSys user in terms of the primitives.  A
    PegsSys user is given the illusion that logical formulas do not exist, even
    though PegaSys reasons about them internally.  This involves (1) checking
    whether an FDD is meaningful syntactically, (2) determining whether
    hierarchical refinements of an FDD are methodologically sound, and (3)
    deciding whether an FDD hierarchy is logically consistent with the program
    that it is intended to describe.  The techniques used to provide these
    capabilities are discussed along with the logical properties that enable
    PegaSys to maintain the user illusion.", 
  location     = "http://dx.doi.org/10.1145/6465.6478"
}

@Article{edafrcohsn,
  author       = "Bhoedjang, Raoul A.~F. and Verstoep, Kees and R{\" u}hl, Tim and Bal, Henri~E. and Hofman, Rutger F.~H.",
  title        = "Evaluating Design Alternatives for Reliable Communication on High-Speed Networks",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems (ASPLOS IX))",
  year         = 2000,
  volume       = 34,
  number       = 5,
  pages        = "71--81",
  month        = dec,
  keywords     = "network interfaces, parallel programming systems, network
    performance, multicast, reliability, broadcast",
  abstract     = "We systematically evaluate the performance of five
    implementations of a single, user-level communication interface.  Each
    implementation makes different architectural assumptions about the
    reliability of the network hardware and the capabilities of the network
    interface.  The implementations differ accordingly in their division of
    protocol tasks between host software, network-interface firmware, and
    network hardware.  Using microbenchmarks, parallel-programming systems, and
    parallel applications, we assess the performance impact of different
    protocol decompositions.  We show how moving protocol tasks to a relatively
    slow network interface yields both performance advantages and
    disadvantages, depending on the characteristics of the application and the
    underlying parallel-programming system.  In particular, we show that a
    communication system that assumes highly reliable network hardware and that
    uses network-interface support to process multicast traffic performs best
    for all applications.",
  location     = "http://www.cs.cornell.edu/raoul/papers/asplos2000.pdf", 
  location     = "http://dx.doi.org/10.1145/384264.379004"
}

@Article{amfsorfp,
  author       = "Banerjee, Debasish",
  title        = "{A} Methodology for Synthesis of Recursive Functional Programs",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 3,
  pages        = "441--462",
  month        = jul,
  keywords     = "programming from example, fp systems, least fixed point,
    recursive programs, program transformation",
  abstract     = "John Backus introduced the Functional Programming (FP)
    system, the variable-free applicative system having reduction semantics.
    Backus has also introduced a unique expansion technique for reasoning about
    a class of recursive FP programs.  As a natural outgrowth of this expansion
    technique, an FP program synthesis methodology is described in this paper.
    The methodology synthesizes recursive FP programs of the form f = p →, q;
    E(f .  h) from their preformulated case-by-case descriptions, which in turn
    come from given input-output example specifications.  After explaining the
    methodology informally, formalization in the form of a definition and a
    synthesis theorem is introduced.  A sufficient condition for the functional
    form E, for successful synthesis under the present methodology, is obtained
    structurally.  Several illustrative examples of synthesis are also
    included.", 
  location     = "http://dx.doi.org/10.1145/24039.24071"
}

@Article{tcoas86,
  author       = "Turchin, Valentin~F.",
  title        = "The Concept of a Supercompiler",
  journal      = toplas,
  year         = 1986,
  volume       = 8,
  number       = 3,
  pages        = "292--325",
  month        = jul,
  keywords     = "program transformation, lazy evaluation, rafel, metasystem
  transition, program optimization, supercompilation, prolog",
  abstract     = "A supercompiler is a program transformer of a certain type.
    It traces the possible generalized histories of computation by the original
    program, and compiles an equivalent program, reducing in the process the
    redundancy that could be present in the original program.  The nature of
    the redundancy that can be eliminated by supercompilation may be various,
    e.g., some variables might have predefined values (as in partial
    evaluation), or the structure of control transfer could be made more
    efficient (as in lazy evaluation), or it could simply be the fact that the
    same variable is used more than once.  The general principles of
    supercompilation are described and compared with the usual approach to
    program transformation as a stepwise application of a number of equivalence
    rules.  It is argued that the language Refal serves the needs of
    supercompilation best.  Refal is formally defined and compared with Prolog
    and other languages.  Examples are given of the operation of a Refal
    supercompiler implemented at CCNY on an IBM/370.", 
  location     = "http://dx.doi.org/10.1145/5956.5957"
}

@Article{tgocp,
  author       = "Carson, Scott~D. and {Reynolds, Jr.}, Paul~F.",
  title        = "The Geometry of Concurrent Programs",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 1,
  pages        = "25--53",
  month        = jan,
  keywords     = "deadlock detection, semaphore properties",
  abstract     = "Synchronization errors in concurrent programs are notoriously
    difficult to find and correct.  Deadlock, partial deadlock, and unsafeness
    are conditions that constitute such errors.  A model of concurrent
    semaphore programs based on multidimensional, solid geometry is presented.
    While previously reported geometric models are restricted to two-process
    mutual exclusion problems, the model described here applies to a broader
    class of synchronization problems.  The model is shown to be exact for
    systems composed of an arbitrary, yet fixed number of concurrent processes,
    each consisting of a straight line sequence of arbitrarily ordered
    semaphore operations.", 
  location     = "http://dx.doi.org/10.1145/9758.9759"
}

@Article{eodbms,
  author       = "Fry, James~P. and Sibley, Edgar~H.",
  title        = "Evolution of Data-Base Management Systems",
  journal      = surveys,
  year         = 1976,
  volume       = 8,
  number       = 1,
  pages        = "7--42",
  month        = mar,
  keywords     = "database management, distributed databases, special-purpose
    languages, standards, data definition", 
  abstract     = "This paper deals with the history and definitions common to 
    data-base technology.  It delimits the objectives of data-base management
    systems, discusses important concepts, and defines terminology for use by
    other papers in this issue, traces the development of data-base systems
    methodology, gives a uniform example, and presents some trends and issues.
    Keywords and Phrases: data base, data-base management, data definition,
    data manipulation, generalized processing, data model, data independence,
    distributed data base, data-base machines, data dictionary", 
  location     = "http://dx.doi.org/10.1145/356662.356664"
}

@Article{ttplcacm,
  author       = "Holt, Richard~C. and Cordy, James~R.",
  title        = "The {T}uring Programming Language",
  journal      = cacm,
  year         = 1988,
  volume       = 31,
  number       = 12,
  pages        = "1410--1423",
  month        = dec,
  keywords     = "programming languages, design, pascal, ada",
  abstract     = "Turing, a new general purpose programming language, is 
    designed to have Basic's clean interactive syntax, Pascal's elegance, and
    C's flexibility.", 
  location     = "http://dx.doi.org/10.1145/53580.53581"
}

@Article{papa,
  author       = "Lebeck, Alvin~R. and Fan, Xiaobo and Zeng, Heng and Ellis, Carla",
  title        = "Power Aware Page Allocation",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "105--116",
  month        = dec,
  keywords     = "power management, page-allocation algorithms, dram",
  abstract     = "One of the major challenges of post-PC computing is the need
    to reduce energy consumption, thereby extending the lifetime of the
    batteries that power these mobile devices.  Memory is a particularly
    important target for efforts to improve energy efficiency.  Memory
    technology is becoming available that offers power management features such
    as the ability to put individual chips in any one of several different
    power modes.  In this paper we explore the interaction of page placement
    with static and dynamic hardware policies to exploit these emerging
    hardware features.  In particular, we consider page allocation policies
    that can be employed by an informed operating system to complement the
    hardware power management strategies.  We perform experiments using two
    complementary simulation environments: a trace-driven simulator with
    workload traces that are representative of mobile computing and an
    execution-driven simulator with a detailed processor/memory model and a
    more memory-intensive set of benchmarks (SPEC2000).  Our results make a
    compelling case for a cooperative hardware/software approach for exploiting
    power-aware memory, with down to as little as 45% of the Energy&bull; Delay
    for the best static policy and 1% to 20% of the Energy&bull; Delay for a
    traditional full-power memory.", 
  location     = "http://dx.doi.org/10.1145/378995.379007", 
  location     = "https://users.cs.duke.edu/~alvy/papers/CS-2000-08.pdf"
}

@Article{moas,
  author       = "Enslow Jr., Philip",
  title        = "Multiprocessor Organization---{A} Survey",
  journal      = surveys,
  year         = 1977,
  volume       = 9,
  number       = 1,
  pages        = "103--129",
  month        = mar,
  keywords     = "Computer system organization, concurrent operations,
  interconnection subsystems, multiprocessor operating systems,
  multiprocessors, simultaneous operations",
  abstract     = "Multiprocessors are defined as a subclass of MIMD (Multiple
    Instruction Stream, Multiple Data Stream) multiple-computer systems in
    which the processors have common access to primary memory and the
    input/output channels and there is a single operating system controlling
    the entire complex.  It is possible to characterize the hardware
    organization by the nature of the system utilized to interconnect the
    primary functional units--processors, memory, and input/output channels.
    The three basic interconnection systems discussed are: 1) time-shared
    buses; 2) crossbar switch matrix; and 3) multibus, multiport memories.
    Three organizations for multiprocessor operating systems are also
    discussed: 1) master-slave; 2) separate executive for each processor; and
    3) symmetric treatment of all processors.", 
  location     = "http://dx.doi.org/10.1145/356683.356688"
}

@Article{enpceuht,
  author       = "Kawahito, Motohiro and Komatsu, Hideaki and Nakatani, Toshio",
  title        = "Effective Null Pointer Check Elimination Utilizing Hardware Trap",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "139--149",
  month        = dec,
  keywords     = "java, null pointer checks, page-access optimizations",
  abstract     = "We present a new algorithm for eliminating null pointer
    checks from programs written in Java&trade;.  Our new algorithm is split
    into two phases.  In the first phase, it moves null checks backward, and it
    is iterated for a few times with other optimizations to eliminate redundant
    null checks and maximize the effectiveness of other optimizations.  In the
    second phase, it moves null checks forward and converts many null checks to
    hardware traps in order to minimize the execution cost of the remaining
    null checks.  As a result, it eliminates many null checks effectively and
    exploits the maximum use of hardware traps.  This algorithm has been
    implemented in the IBM cross-platform Java Just-in-Time (JIT) compiler.
    Our experimental results show that our approach improves performance by up
    to 71% for jBYTEmark and up to 10% for SPECjvm98 over the previously known
    best algorithm.  They also show that it increases JIT compilation time by
    only 2.3%.  Although we implemented our algorithm for Java, it is also
    applicable for other languages requiring null checking.", 
  location     = "http://dx.doi.org/10.1145/384264.379234"
}

@Article{oaafgsps,
  author       = "Kubiatowicz, John and Bindel, David and Chen, Yan and Czerwinski, Steven and Eaton, Patrick and Geels, Dennis and Gummadi, Ramakrishan and Rhea, Sean and Weatherspoon, Hakim and Weimer, Westley and Wells, Chris and Zhao, Ben",
  title        = "{OceanStore}: An Architecture for Global-Scale Persistent Storage",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "190--201",
  month        = dec,
  keywords     = "peer-to-peer networking, remote storage, autonomy, ad-hoc
    routing, archival storage",
  abstract     = "OceanStore is a utility infrastructure designed to span the 
    globe and provide continuous access to persistent information.  Since this
    infrastructure is comprised of untrusted servers, data is protected through
    redundancy and cryptographic techniques.  To improve performance, data is
    allowed to be cached anywhere, anytime.  Additionally, monitoring of usage
    patterns allows adaptation to regional outages and denial of service
    attacks; monitoring also enhances performance through pro-active movement
    of data.  A prototype implementation is currently under development.",  
  location     = "http://dx.doi.org/10.1145/356989.357007",  
  location     = "https://www.cs.virginia.edu/~weimer/p/p190-kubi.pdf"
}

@Article{aawa,
  author       = "Olivier Arsac and St{\' e}phane Dalmas and Marc Ga{\" e}tano",
  title        = "Algorithm Animation with {AGAT}",
  journal      = "Computer-Human Interaction in Symbolic Computation",
  year         = 1998,
  volume       = "",
  number       = "",
  pages        = "89--115",
  month        = "",
  keywords     = "algorithm animation, stream computing, client-server
    computing, data analysis",
  abstract     = "Algorithm animation is a powerful tool for exploring a 
    program’s behavior.  It is used in various areas of computer science, such
    as teaching (Rasala et al.  1994), design and analysis of algorithms
    (Bentley and Kernighan 1991), performance tuning (Duisberg 1986).
    Algorithm animation systems provide a form of program visualization that
    deals with dynamic graphical displays of a program’s operations.  They
    offer many facilities for users to view and interact with an animated
    display of an algorithm, by providing ways to control through multiple
    views the data given to algorithms and their execution.", 
  location     = "http://dx.doi.org/10.1007/978-3-7091-6461-7_6"
}

@Article{tenw,
  author       = "Wirth, Niklaus",
  title        = "Type Extensions",
  journal      = toplas,
  year         = 1988,
  volume       = 10,
  number       = 2,
  pages        = "204--214",
  month        = apr,
  keywords     = "extensible data types, modula-2, polymorphism, type systems",
  abstract     = "Software systems represent a hierarchy of modules.  Client
    modules contain sets of procedures that extend the capabilities of imported
    modules.  This concept of extension is here applied to data types.
    Extended types are related to their ancestor in terms of a hierarchy.
    Variables of an extended type are compatible with variables of the ancestor
    type.  This scheme is expressed by three language constructs only: the
    declaration of extended record types, the type test, and the type guard.
    The facility of extended types, which closely resembles the class concept,
    is defined in rigorous and concise terms, and an efficient implementation
    is presented.", 
  location     = "http://dx.doi.org/10.1145/42190.46167"
}

@Article{pgm,
  author       = "Sedgewick, Robert",
  title        = "Permutation Generation Methods",
  journal      = surveys,
  year         = 1977,
  volume       = 9,
  number       = 2,
  pages        = "137--164",
  month        = jun,
  keywords     = "permutations, combinatorial algorithms, code optimization,
    algorithm analysis, lexicographic ordering, random permutations, recursion,
    cyclic rotation.",
  abstract     = "This paper surveys the numerous methods that have been
    proposed for permutation enumeration by computer.  The various algorithms
    which have been developed over the years are described in detail, and
    implemented in a modern Algol-like language.  All of the algorithms are
    derived from a single control structure.  The problems involved with
    implementing the best of the algorithms on real computers are treated in
    detail.  Assembly-language programs are derived and analyzed fully.  The
    paper is intended not only as a survey of permutation generation methods,
    but also as a tutorial on how to compare a number of different algorithms
    for the same task.", 
  location     = "http://dx.doi.org/10.1145/356689.356692"
}

@Article{sadfns,
  author       = "Hill, Jason and Szewczyk, Robert and Woo, Alec and Hollar, Seth and Culler, David and Pister, Kristofer",
  title        = "System Architecture Directiosn for Networked Sensors",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "93--104",
  month        = dec,
  keywords     = "networked sensors, system architecture, event-driven systems,
    power consumption, sensor networks, tinyos",
  abstract     = "Technological progress in integrated, low-power, CMOS
    communication devices and sensors makes a rich design space of networked
    sensors viable.  They can be deeply embedded in the physical world and
    spread throughout our environment like smart dust.  The missing elements
    are an overall system architecture and a methodology for systematic
    advance.  To this end, we identify key requirements, develop a small device
    that is representative of the class, design a tiny event-driven operating
    system, and show that it provides support for efficient modularity and
    concurrency-intensive operation.  Our operating system fits in 178 bytes of
    memory, propagates events in the time it takes to copy 1.25 bytes of
    memory, context switches in the time it takes to copy 6 bytes of memory and
    supports two level scheduling.  The analysis lays a groundwork for future
    architectural advances.", 
  location     = "http://dx.doi.org/10.1145/378993.379006"
}

@Article{cspm,
  author       = "Mattson, Peter and Dally, William~J. and Rixner, Scott and Kapasi, Ujval~J. and Owens, John~D.",
  title        = "Communication Scheduling",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "82--92",
  month        = dec,
  keywords     = "interconnection networks, instruction scheduling, cpu
    architectures", 
  abstract     = "The high arithmetic rates of media processing applications
    require architectures with tens to hundreds of functional units, multiple
    register files, and explicit interconnect between functional units and
    register files.  Communication scheduling enables scheduling to these
    emerging architectures, including those that use shared buses and register
    file ports.  Scheduling to these shared interconnect architectures is
    difficult because it requires simultaneously allocating functional units to
    operations and buses and register file ports to the communications between
    operations.  Prior VLIW scheduling algorithms are limited to clustered
    register file architectures with no shared buses or register file ports.
    Communication scheduling extends the range of target architectures by
    making each communication explicit and decomposing it into three
    components: a write stub, zero or more copy operations, and a read stub.
    Communication scheduling allows media processing kernels to achieve 98% of
    the performance of a central register file architecture on a distributed
    register file architecture with only 9% of the area, 6% of the power
    consumption, and 37% of the access delay, and 120% of the performance of a
    clustered register file architecture on a distributed register file
    architecture with 56% of the area and 50% of the power consumption.", 
  location     = "http://dx.doi.org/10.1145/378993.379005"
}

@Article{dfaisr,
  author       = "Fosdick, Lloyd~D. and Osterweil, Leon~J.",
  title        = "Data Flow Analysis in Software Reliability",
  journal      = surveys,
  year         = 1976,
  volume       = 8,
  number       = 3,
  pages        = "305--330",
  month        = sep,
  keywords     = "automatic documentation, automatic error detection, data flow
    analysis, software reliability, control-flow graphs, static analysis,
    fortran, compilation",
  abstract     = "The ways that the methods of data flow analysis can be 
    applied to improve software reliability are described.  There is also a
    review of the basic terminology from graph theory and from data flow
    analysis in global program optimization.  The notation of regular
    expressions is used to describe actions on data for sets of paths.  These
    expressions provide the basis of a classification scheme for data flow
    which represents patterns of data flow along paths within subprograms and
    along paths which cross subprogram boundaries.  Fast algorithms, originally
    introduced for global optimization, are described and it is shown how they
    can be used to implement the classification scheme.  It is then shown how
    these same algorithms can also be used to detect the presence of data flow
    anomalies which are symptomatic of programming errors.  Finally, some
    characteristics of and experience with DAVE, a data flow analysis system
    embodying some of these ideas, are described.",
  location     = "http://dx.doi.org/10.1145/356674.356676"
}

@Article{spfhpplim,
  author       = "Duesterwald, Evelyn and Bala, Vasanth",
  title        = "Software Profiling for Hot Path Prediction:  Less is More",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "202--211",
  month        = dec,
  keywords     = "path prediction, jit compilation, dynamic analysis, hot-spot
    detection",
  abstract     = "Recently, there has been a growing interest in exploiting
    profile information in adaptive systems such as just-in-time compilers,
    dynamic optimizers and, binary translators.  In this paper, we show that
    sophisticated software profiling schemes that provide highly accurate
    information in an offline setting are ill-suited for these dynamic code
    generation systems.  We experimentally demonstrate that hot path
    predictions must be made early in order to control the rising cost of
    missed opportunity that result from the prediction delay.  We also show
    that existing sophisticated path profiling schemes, if used in an online
    setting, offer no prediction advantages over simpler schemes that exhibit
    much lower runtime overheads.Based on these observation we developed a new
    low-overhead software profiling scheme for hot path prediction.  Using an
    abstract metric we compare our scheme to path profile based prediction and
    show that our scheme achieves comparable prediction quality.  In our second
    set of experiments we include runtime overhead and evaluate the performance
    of our scheme in a realistic application: Dynamo, a dynamic optimization
    system.  The results show that our prediction scheme clearly outperforms
    path profile based prediction and thus confirm that less profiling as
    exhibited in our scheme will actually lead to more effective hot path
    prediction.", 
  location     = "http://dx.doi.org/10.1145/356989.357008"
}

@Article{tscf,
  author       = "Clif Flynt",
  title        = "{TCL} Scrollbars",
  journal      = login,
  year         = 2002,
  volume       = 27,
  number       = 3,
  pages        = "25--30",
  month        = jun,
  keywords     = "tcl, tk, scrollbars, canvas",
  location     = "https://www.usenix.org/publications/login/june-2002-volume-27-number-3/tclsh-spot"
}

@Article{oaccitdoti6a,
  author       = "Zahir, Rumi and Ross, Jonathan and Morris, Dale and Hess, Drew",
  title        = "{OS} and Compiler Considerations in the Design of the {IA}-64 Architecture",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "212--221",
  month        = dec,
  keywords     = "cpu architecture, speculative execution, compiler
    optimization, operating system optimizations",
  abstract     = "Increasing demands for processor performance have outstripped
    the pace of process and frequency improvements, pushing designers to find
    ways of increasing the amount of work that can be processed in parallel.
    Traditional RISC architectures use hardware approaches to obtain more
    instruction-level parallelism, with the compiler and the operating system
    (OS) having only indirect visibility into the mechanisms used.The IA-64
    architecture [14] was specifically designed to enable systems which create
    and exploit high levels of instruction-level parallelism by explicitly
    encoding a program's parallelism in the instruction set [25].  This paper
    provides a qualitative summary of the IA-64 architecture features that
    support control and data speculation, and register stacking.  The paper
    focusses on the functional synergy between these architectural elements
    (rather than their individual performance merits), and emphasizes how they
    were designed for cooperation between processor hardware, compilers and the
    OS.", 
  location     = "http://dx.doi.org/10.1145/378993.379242"
}

@Article{asoatfda,
  author       = "Weide, Bruce",
  title        = "A Survey of Analysis Techniques for Discrete Algorithms",
  journal      = surveys,
  year         = 1977,
  volume       = 9,
  number       = 4,
  pages        = "291--313",
  month        = dec,
  keywords     = "algorithms analysis,  computational  complexity,
   combinatorics,  NP-complete problems,  approximation  algorithms", 
  abstract     = "This survey includes an introduction to the concepts of 
    problem complexity, analysis of algorithms to find bounds on complexity,
    average-case behavior, and approximation algorithms The major techniques
    used m analysis of algorithms are reviewed and examples of the use of these
    methods are presented.  A brief explanation of the problem classes P and
    NP, as well as the class of NP-complete problems, is also presented.", 
  location     = "http://dx.doi.org/10.1145/356707.356711"
}

@Article{paicp,
  author       = "R.~C.~B. Cooper and K.~G. Hamilton",
  title        = "Preserving Abstraction in Concurrent Programming",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 2,
  pages        = "258--263",
  month        = feb,
  keywords     = "abstraction, clu, monitors, concurrency control, deadlock,
    interface, module, process, synchronization operating systems",
  abstract     = "Recent programming languages have attempted to provide
    support for concurrency and for modular programming based on abstract
    interfaces.  Building on experience of adding monitors to CLU, a language
    oriented towards data abstraction, it is explained how these two goals
    conflict.  In particular, the clash between conventional views on interface
    abstraction and the programming style required for avoiding monitor
    deadlock is discussed.  It is argued that the best compromise between these
    goals is a combination of a fine-grain locking mechanism together with a
    method for explicitly defining concurrency properties for selected
    interfaces",
  location     = "http://dx.doi.org/10.1109/32.4643"
}

@Article{tfsoasbis,
  author       = "David Gray",
  title        = "The Formal Specification of a Small Bookshop Information System",
  journal      = tse,
  year         = 1088,
  volume       = 14,
  number       = 2,
  pages        = "263--272",
  month        = feb,
  keywords     = "formal specifications, requirements analysis, mathematical
    specification, set theory, z",
  abstract     = "A specification, and its development, for a small bookshop
    information system are discussed.  the specification is presented using
    mathematics and the scheme calculus of C.  Morgan and B.  Sufrin.  An
    insight is given into how the specification was developed and why a formal
    specification is appropriate.", 
  location     = "http://dx.doi.org/10.1109/32.4644"
}

@Article{cgutmadp,
  author       = "Aho, Alfred~V. and Ganapathi, Mahadevan and Tjiang, Steven~W.~K.",
  title        = "Code Generation Using Tree Matching and Dynamic Programming",
  journal      = toplas,
  year         = 1989,
  volume       = 11,
  number       = 4,
  pages        = "491--516",
  month        = oct,
  keywords     = "twig, code generation, tree matching, dynamic programming,
    machine descriptions",
  abstract     = "Compiler-component generators, such as lexical analyzer
    generators and parser generators, have long been used to facilitate the
    construction of compilers.  A tree-manipulation language called twig has
    been developed to help construct efficient code generators.  Twig
    transforms a tree-translation scheme into a code generator that combines a
    fast top-down tree-pattern matching algorithm with dynamic programming.
    Twig has been used to specify and construct code generators for several
    experimental compilers targeted for different machines.", 
  location     = "http://dx.doi.org/10.1145/69558.75700"
}

@Book{taeff,
  author       = "Frederick Franck",
  title        = "The Awakened Eye",
  publisher    = "Knopf",
  year         = 1979,
  address      = nyny,
  keywords     = "drawing, zen, looking and seeing",
  location     = "NC 139.F72 A4"
}

@Book{tlwmg,
  author       = "Martha Grimes",
  title        = "The Lamorna Wink",
  publisher    = "Viking",
  year         = 1999,
  address      = nyny,
  keywords     = "murrdaar, the long arms of the past",
  location     = "PS 3557.R48994 L36"
}

@Book{tgofsothoap,
  author       = "Walter Mosley",
  title        = "The Gift of Fire \slash{} On the Head of a Pin",
  publisher    = "Tor",
  year         = 2012,
  address      = nyny,
  keywords     = "godz, vr",
  location     = "PS 3563.O88456 G54"
}

@Book{fscssbbesg,
  author       = "Simon Goldhill",
  title        = "Freud's Couch, Scott's Buttocks, Bront{\" e}'s Grave",
  publisher    = ucp,
  year         = 2011,
  address      = chil,
  keywords     = "scott, wordsworth, bronte, shakespere, freud, pilgrimages,
    victorians, writer's houses",
  location     = "PR 110.G7 G65"
}

@Book{tyematen,
  author       = "Salman Rushdie",
  title        = "Two Years Eight Months and Twenty-Eight Nights",
  publisher    = "Random House",
  year         = 2015,
  address      = nyny,
  keywords     = "magic, genies, conflict, miscegenation",
  location     = "PR 6068.U757 T96"
}

@Book{tfas,
  author       = "Daniel Kahneman",
  title        = "Thinking, Fast and Slow",
  publisher    = fsg,
  year         = 2011,
  address      = nyny,
  keywords     = "cognition, judgment, reasoning, decision making, risk
    analysis", 
  location     = "BF 441 K238"
}

@Book{spetdg,
  author       = "Philip~E. Tetlock and Dan Gardner",
  title        = "Superforecasters",
  publisher    = "Crown",
  year         = 2015,
  address      = nyny,
  keywords     = "forecasting, estimation, predictions, reasoning",
  location     = "HB 3730 T47"
}

@Book{trmwm,
  author       = "Walter Mosley",
  title        = "The Right Mistake",
  publisher    = "Basic Books",
  year         = 2008,
  address      = nyny,
  keywords     = "bootstrappin'",
  location     = "PS 3563.O88456 R48"
}

@Book{ttpl,
  author       = "Richard~C. Holt and Philip~A. Matthews and J.~Alan Rosselet and James~R. Cordy",
  title        = "The Turing Programming Language",
  publisher    = ph,
  year         = 1988,
  address      = ecnj,
  keywords     = "turing, programming language"
}

@Book{htbp,
  author       = "Eugenia Cheng",
  title        = "How to Bake $\pi$",
  publisher    = "Basic Books",
  year         = 2015,
  address      = nyny,
  keywords     = "mathematics, category theory",
  location     = "QA 9 C4862"
}

@Book{hnk,
  author       = "Noel Kingsbury",
  title        = "Hybrid",
  publisher    = ucp,
  year         = 2009,
  address      = chil,
  keywords     = "plant breeding, agriculture, hybridization",
  location     = "SB 123.K554"
}

@Book{bcof,
  author       = "James~M. McPherson",
  title        = "Battle Cry of Freedom",
  publisher    = oup,
  year         = 1988,
  volume       = "6",
  series       = "Oxford History of the United States",
  address      = nyny,
  keywords     = "civil war, slavery, politics, military",
  location     = "E 173.O94 v.6"
}

@Book{rgwm,
  author       = "Walter Mosley",
  title        = "Rose Gold",
  publisher    = "Doubleday",
  year         = 2014,
  address      = nyny,
  keywords     = "murrdaar, official corruption",
  location     = "PS 3463.O88456 R68"
}

@Book{idon,
  author       = "John~F. Geer",
  title        = "In Defense of Negativity",
  publisher    = ucp,
  year         = 2006,
  address      = chil,
  keywords     = "campaign management, political advertising, political
    campaigns, presidential elections, negativism, mud flinging, attack ads",
  location     = "JK 2281.G44"
}

@Book{erdr,
  author       = "Dani Rodrik",
  title        = "Economic Rules",
  publisher    = "W.~W. Norton",
  year         = 2015,
  address      = nyny,
  keywords     = "economics, modeling",
  location     = "HB 75 R5785"
}

@Book{sep,
  author       = "Walter Mosley",
  title        = "Six Easy Pieces",
  publisher    = "Atria Books",
  year         = 2003,
  address      = nyny,
  keywords     = "murrdaars",
  location     = "PS 3563.O88456 S59 2003"
}

@Book{iacp,
  author       = "Craig Packer",
  title        = "Into Africa",
  publisher    = ucp,
  year         = 1996,
  address      = chil,
  keywords     = "africa, serengetti, mammal research, lions, ecology",
  location     = "QL 31.P15 A3"
}

@Book{mjatgm,
  author       = "Lee Alan Dugatkin",
  title        = "Mr. Jefferson and the Giant Moose",
  publisher    = ucp,
  year         = 2009,
  address      = chil,
  keywords     = "natural history, degeneracy theory, buffon, jefferson, pr,
    scientific progress",
  location     = "QH 528 D843"
}

@Book{tgfwpw,
  author       = "Walter Prescott Webb",
  title        = "The Great Frontier",
  publisher    = uta # " Press",
  year         = 1964,
  address      = atx,
  keywords     = "civilization, development, institutions",
  location     = "CB 245 W4"
}

@Book{tttwm,
  author       = "Walter Mosley",
  title        = "The Tempest Tales",
  publisher    = "Black Classic Press",
  year         = 2008,
  address      = bama,
  keywords     = "morality, sin, heaven and hell",
  location     = "PS 3563.O88456 T46"
}

@InProceedings{wsm,
  author       = "Ryan Culpepper and Mathias Felleisen",
  title        = "Well-Shaped Macros",
  booktitle    = "Scheme 2003: " # pot # " Fourth Workshop on Scheme and
                Functional Programming",
  year         = 2003,
  editor       = "Matthew Flatt",
  pages        = "59--68",
  address      = boma,
  month        = "7 " # nov,
  keywords     = "macros, shapes, scheme",
  abstract     = "Scheme includes an easy-to-use and powerful macro mechanism
    for extending the programming language with new expression and definition
    forms.  Using macros, a Scheme programmer can define a new notation for a
    specific problem domain and can then state algorithms in this language.
    Thus, Scheme programmers can formulate layers of abstraction whose
    expressive power greatly surpasses that of ordinary modules.
    Unfortunately, Scheme's macros are also too powerful.  The problem is that
    macro definitions extend the parser, a component of a language's
    environment that is always supposed to terminate and produce predictable
    results, and that they can thus turn the parser into a chaotic and
    unpredictable tool.  In this paper, we report on an experiment to tame the
    power of macros.  Specifically, we introduce a system for specifying and
    restricting the class of shapes that a macro can transform.  We dub the
    revised macro system well-shaped macros.", 
  location     = "www.cs.utah.edu/techreports/2003/abstracts/UUCS-03-023a.pdf"
}

@TechReport{taotiotmcpzoat,
  author       = "Steele Jr., Guy Lewis and Sussman, Gerald~J.",
  title        = "The Art of the Interpreter or, The Modularity Complex (Parts Zero, One, and Two)",
  institution  = ail # ", " # mit,
  year         = 1978,
  type         = "AI Memo",
  number       = 453,
  address      = cma,
  month        = may,
  keywords     = "abstraction, actors, applicative order, bindings, control
    structures, debugging, dynamic scoping, environments, fluid variables,
    funarg problem, functional objects, interactive programming, lambda
    calculus, lexical scoping, lisp, modularity, procedural data, recursion
    equations, referential transparency, scheme, side effects, static scoping,
    structured programming", 
  abstract     = "We examine the effects of various language design decisions
    on the programming styles available to a user of the language, with
    particular emphasis on the ability to incrementally construct modular
    systems.  At each step we exhibit an interactive meta-circular interpreter
    for the language under consideration.  Each new interpreter is the result
    of an incremental change to a previous interpreter.  The interpreters we
    exhibit are all written in a simple dialect of LISP, and all implement
    LISP-like languages.  A subset of these interpreters constitute a partial
    historical reconstruction of the actual evolution of LISP.", 
  location     = "http://repository.readscheme.org/ftp/papers/ai-lab-pubs/AIM-453.pdf"
}

@TechReport{spirl,
  author       = "Robert Lawler",
  title        = "Some Powerful Ideas",
  institution  = ail # ", " # mit,
  year         = 1981,
  type         = "A.I. Memo",
  number       = 652,
  address      = cma,
  month        = dec,
  keywords     = "logo, heuristics, problem solving",
  abstract     = "Here is a set of problem solving ideas (absorbed by and 
    developed through the MIT Logo project over many years) presented in such a
    way as to useful to someone with a Logo computer.  With the ideas on
    unbound, single sheets, you can easily pick out those you like and set
    aside the others.  The ideas vary in sophistication and accessibility: no
    threshold, no ceiling.", 
  location     = "http://hdl.handle.net/1721.1/6363"
}

