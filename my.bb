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

