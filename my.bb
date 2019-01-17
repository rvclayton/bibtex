.so bibtex.header
		  

@InProceedings{ehs,
  author       = "Brian~D. Markey",
  title        = "Emerging Hypermedia Standards",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "59--74",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "standards, hypermedia, sgml, mheg, hytime, oda"
}

@InProceedings{mpshwtaam,
  author       = "Kazutoshi Fujikawa and Shinji Shimojo and Toshio Matsuura and Shojiro Nishio and Hideo Miyahara",
  title        = "Multimedia Presentation System ``{Harmony}'' with Temporal and Active Media",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "75--93",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "hypermedia, object-oriented systems, active links,
    event-based scheduling",
  abstract     = "This paper proposes a multimedia presentation system Harmony
    which can deal with temporal and active media such as motion video,
    computer animation, and music sounds.  Harmony is based on the notion of a
    hyperobject which integrates a hypertext system with an object-oriented
    framework.  Each object is considered a node as is usual in hypertext
    systems, and the relations between objects are represented as links between
    nodes.  Harmony extends the ordinary notion of a link.  A link in Harmony
    consists of three components: objects connected by the link, conditions
    specifying when the link is navigated, and messages sent to the target
    object.  In addition to such an extension, each object can include internal
    objects called subobjects which specify parts of an object and can become a
    source/destination of a link.  Furthermore, the notion of a group object is
    introduced to represent a synchronization of parallel displayed media
    information.  Through these extended notions of a hypertext model, temporal
    and active media can be easily handled through the description of temporal
    relations from the media in hypermedia documents.  Based on the design of
    Harmony, we have implemented a prototype multimedia presentation system
    which deals with text, music, graphics, motion video, and computer
    animation as objects.  Harmony consists of three subsystems: link manager
    subsystem (Harmony/LM), user interface subsystem (Harmony/UI), and
    object-oriented database (Harmony/DB), where a commercial object-oriented
    database was employed as the Harmony/DB.  Scenario viewer was developed for
    displaying the structure of scenario in a tree graph which can reduce a
    cognitive overhead in a hypermedia document.  The whole system was
    constructed based on C++ Language." 
}

@InProceedings{sefhpp,
  author       = "Seiki Inoue and Masahiro Shibata",
  title        = "Spatiotemporal Editing for {HDTV} Program Production",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "95--104",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "video editing, image processing, image synthesis",
  abstract     = {We have been developing a component image database for scene
    synthesis.  This report describes a new scene generation method using that
    image database and a multilayered image synthesizer.  In this method,
    several components images transferred from the database are arranged on
    multiple layers in spatiotemporal domain and combined to a scene or a whole
    program itself.  We call this method spatiotemporal editing.  An
    experimental HDTV (Hi-Vision) system was also developed and usefulness of
    this method was confirmed through actual Hi-Vision program productions.} 
}

@InProceedings{nofcstcs,
  author       = "Matthew Witten and Robert~E. Wyatt",
  title        = "Neural Orchestration:  From Cortical Simulation to Cortical Symphony",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "107--124",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "neural simulation, neural orchestration, biosymphonics,
    visualization, symphonics, realization, representation, actualization,
    cognitive descriptor, visualization descriptor",
  abstract     = "The signal flow in a vertical slab of neural tissue in cat
    area 17 has been computationally modeled.  The modeled slab covers 500x500
    mu^2 of cortical surface and extends vertically though the full cortex
    depth.  Data visualization complexity requires both visual and audio
    representation.  This paper presents the unique issues of and the complex 
    orchestral visualization of cortical simulation.  This leads to the
    concepts and formalizations necessary for a general theory of
    visualization."
}

@InProceedings{maempsdwaoot,
  author       = "Richard~L. Phillips",
  title        = "{MediaView}:  An Editable Multimedia Publishing System Developed with an Object-Oriented Toolkit",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "125--136",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "media editing, wysiwyg editing, nextstep, user-interface
    toolkits, object-oriented components, objective c",
  abstract     = "MediaView is an editable multimedia publication system, a
    feature that sets it apart from any system currently or previously
    available.  It achieves power, flexibility, and ease of use through the
    familiar cut, copy , and past exemplar normally applied only to text in
    WYSIWYG word processors.  In MediaView all components are manipulated this
    way.  MediaView was developed on a NeXT computer using the object-oriented
    development system called NeXTstep.  The powerful base classes defined
    there, coupled with Objective-C features like dynamic binding, enabled
    MediaView to be developed in a short time but with a rich feature set.  Two
    key subclasses of NeXTstep objects give MediaView its strengths.  Through
    them, arbitrarily complex multimedia components can be installed in a
    document and then copied and pasted, just as if they were words.  MediaView
    has two document formats --- one for compactness and speed and one for
    interchange with other applications and other computers.  The latter format
    s based on a hierarchical file system, which is well suited to UNIX but
    also to other systems, like that found on a Macintosh." 
}

@InProceedings{asftdmd,
  author       = "Dick C.~A. Bulterman and Guido {van Rossum} and Robert {van Liere}",
  title        = "{A} Structure for Transportable, Dynamic Multimedia Documents",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "137--155",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "dynamic multimedia document, multimedia document structure,
    portability, event descriptor, attribute descriptor, cwi multimedia
    interchange format, structural relationships, layered description,
    synchronization channel, synchronization arc",
  abstract     = "This paper presents a document structure for describing
    transportable, dynamic multimedia documents.  Multimedia documents consist
    of a set of discrete data components that are joined together in time and
    space to present a user (or reader) with a single coordinated whole.
    Transportable documents are those in which the document structure can be
    accessed across system environments independently of individual component
    input or output dependencies; dynamic documents are those in which the
    synchronization of document components are not staticly defined as an
    integral part of the data definition but are dynamicly defined as
    attributes of the general document structure.  The focus of this paper is
    the presentation of the basic building blocks of the CWI Multimedia
    Interchange Format (CMIF).  CMIF is used to describe the temporal and
    structural relationships that exist in multimedia documents.  In order to
    put our work in a concrete context, we start our discussion with a brief
    description of the portability requirements for documents used within the
    CWI/Multimedia Pipeline.  We then provide a layered description of our
    document structure format; this format provides a means for expressing a
    document in terms of synchronization channels, event descriptors, data
    descriptors, data blocks and synchronization arcs, each element of which
    contains a set of appropriate descriptive attributes.  The paper describes
    each of these concepts abstractly as well as in the context of a uniform
    example.  The paper concludes with a discussion of our intended future
    direction in using the various attribute descriptors to control a broad
    range of activities within the CWI/Multimedia Pipeline.", 
  location     = "http://homepages.cwi.nl/~dcab/PDF/usenix.doc.pdf"
}

@InProceedings{adattdoepp,
  author       = "Ying Liu and Ambuj~K. Singh and Rajive Bagrodia",
  title        = "{A} Decompositional Approach to the Design of Efficient Parallel Programs",
  booktitle    = pot # "4th International PARLE Conference on Parallel Architectures and Languages Europe",
  year         = 1992,
  editor       = "Etiemble, D. and Syre, J.~C.",
  pages        = "21--36",
  publisher    = sv,
  series       = lncs,
  volume       = 605,
  address      = "Paris, France",
  month        = "15--18 " # jun,
  keywords     = "unity",
  abstract     = "A methodology for the derivation of efficient parallel
    implementations from program specifications is developed.  The goal of the
    methodology is to decompose a program specification into a collection of
    module specifications, such that each module may be implemented by a
    subprogram.  The correctness of the whole program is then deduced from the
    correctness of the property refinement procedure and the correctness of the
    individual subprograms.  The refinement strategy is based on identifying
    frequently occurring control structures such as sequential composition and
    iteration.  The methodology is developed in the context of the UNITY logic
    and the UC programming language, and illustrated through the solution of
    diffusion aggregation in fluid flow simulations.", 
  location     = "ISBN:3-540-55599-4", 
  location     = "https://doi.org/10.1007/3-540-55599-4_78"
}

@InProceedings{pmic,
  author       = "Thomas G.~Aguierre Smith and Natalio Pincever",
  title        = "Parsing Movies in Context",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "157--168",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "media production, segmentation, stratification, video
    database, annotations, logging, audio cues",
  abstract     = "Traditional approaches in Multimedia systems force the user
    to segment video material into simple descriptions, which usually include
    endpoints and a brief text description in the form of keywords.  We propose
    to segment contextual information into chunks rather than segmenting
    contiguous frames.  The computer can help us organize sets of descriptions
    that are related to the recorded moving image: it can help us remember what
    we have shot.  Such descriptions can overlap, be contained in, and even
    encompass a multitude of other descriptions.  Parsing moving image
    sequences is reduced to simply parsing the contextual information which
    forms the description.  Our approach, Stratification, also has important
    ramifications in terms of an elastic representation of moving images.
    Ambient sound can provide us with important contextual clues as to what is
    going on within the frames.  Using audio to find patterns of content is an
    important step towards the eventual automatization of the logging
    process.", 
  location     = "http://mf.media.mit.edu/pubs/journal/ParsingContext.pdf"
}

@InProceedings{dmhctndrbs,
  author       = "Michael Pasieka and Paul~G. Crumley and Ann Marks and Ann Infortuna",
  title        = "Distributed Multimedia:  How Can the Necessary Data Rates be Supported?",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "169--182",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "token right, protocol development, performance measurement,
    multimedia transport, direct memory access",
  abstract     = "At the Information Technology Center at Carnegie Mellon
    University, we have been developing a system in which it is possible to
    deliver data to a presentation machine from a remote machine across a
    public network at a sustained high rate.  We have called this system a
    Continuous Time Media System (CTMS).  We have found that the UNIX 2 model
    used for transfer of data between two devices, the network transport
    protocols, and the ability of adapters to transfer data between themselves
    are insufficient to do this.  We have made modifications to each of these
    system in order to create a prototype system that we can measure to help
    define a CTMS protocol.  We present the results of this work in this
    paper.", 
  location     = "http://reports-archive.adm.cs.cmu.edu/anon/itc/CMU-ITC-107.pdf"
}

@InProceedings{msreftmos,
  author       = "Jun Nakajima and Masatomo Yazaki and Hitoshi Matsumoto",
  title        = "Multimedia\slash Realtime Extensions for the {Mach} Operating System",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "183--198",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "scheduling, event handling, interrupt handling, realtime
    threads, asynchrony, multimedia application constraints, memory management,
    user-mode device drivers",
  abstract     = "We have extended the Mach operating system to support
    multimedia applications.  Our extensions for Mach provide the system
    designers and the developers with a reliable and flexible multimedia
    processing environment.  This paper focuses on realtime issues while
    supporting multimedia applications, asynchronous event notification which
    follows the POSIX P1003.4 proposal, preemptive deadline scheduling, and
    device drivers which run in user mode.  Preemptive deadline scheduling
    preempts asynchronous event notification for continuous media that requires
    each event handler to execute as soon as possible and schedules other event
    handlers to meet their time constraints as well.  The system designers must
    develop device divers for a wide variety of multimedia devices.  New
    devices will appear as multimedia technology progresses.  User-mode device
    drivers will help develop device drivers efficiently and provide a flexible
    environment.  The rationale, design, implementation and performance are
    presented." 
}

@InProceedings{atfmdvaas,
  author       = "P.~Venkat Rangan and Walter~A. Burkhard and
    Robert~W. Bowdidge and Harrick~M. Vin and John~W. Lindwall and Kashun Chan
    and Ingvar~A. Aaberg and Linda~M. Yamanoto and Ian~G. Harris",
  title        = "A Testbed for Managing Digital Video and Audio Storage",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "199--208",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "ropes, strands, media storage, media abstractions",
  abstract     = "We have developed a testbed for studying multimedia storage
    systems. We are using the testbed to experiment with media storage issues
    such as synchronization, continuous recording and retrieval, and
    manipulation of large files.  We define strand and rope abstractions that
    provide a paradigm for accessing multiple media.  Our system software
    architecture consists of two layers: the device-independent rope server,
    and the device-specific storage manager.  We have implemented a prototype
    within a Sun and PC environment.  We present our experiences and discuss
    system performance." 
}

@InProceedings{fssah,
  author       = "Hume, Andrew and Sunday, Daniel",
  title        = "Fast String Searching",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "221--233",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "string search, boyer moore, metaprogramming, performance",
  abstract     = "Despite substantial theoretical progress, there has been
    little improvement in practical string searching since the Boyer-Moore
    algorithm in 1977.  And even Boyer-Moore took several years to infiltrate
    the UNIX community.  We describe a new framework for understanding a class
    of algorithms based on the skip loop variant of Boyer-Moore and describe
    various components that can be used in this framework.  This leads to new
    algorithms that are substantially faster than the algorithms in current
    use.  Furthermore, new algorithms can be synthesised automatically from the
    names of component pieces.  The code for the algorithms is publicly
    available.", 
  location     = "https://doi.org/10.1002/spe.4380211105"
}

@InProceedings{taotimw,
  author       = "Eric Lindemann and Miller Puckette and Eric Viara and Maurizio {De Cecco} and Francois Dechelle and Bennett Smith",
  title        = "The Architecture of the {IRCAM} Musical Workstation",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "209--220",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "signal processing, real-time operating systems, software tools",
  location     = "https://www.jstor.org/stable/3680764"
}

@InProceedings{812tp9ws,
  author       = "Rob Pike",
  title        = "$8\,1/2$, the {Plan} 9 Window System",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "257--265",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "window systems, file systems, plan 9",
  abstract     = "The Plan 9 window system, 8½, is a modest-sized program of
    novel design.  It provides textual I/O and bitmap graphic services to both
    local and remote client programs by offering a multiplexed file service to
    those clients.  It serves traditional UNIX files like /dev/tty as well as
    more unusual ones that provide access to the mouse and the raw screen.
    Bitmap graphics operations are provided by serving a file called
    /dev/bitblt that interprets client messages to perform raster operations.
    The file service that 8½ offers its clients is identical to that it uses
    for its own implementation, so it is fundamentally no more than a
    multiplexer.  This architecture has some rewarding symmetries and can be
    implemented compactly.", 
  location     = "https://9p.io/sys/doc/8%C2%BD/8%C2%BD.html"
}

@InProceedings{sssfssfi,
  author       = "David~G. Korn and Kiem-Phong Vo",
  title        = "{SFIO}:  Safe\slash Fast String\slash File {IO}",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "257--265",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "i-o, streams, unix, stdio",
  abstract     = "This paper describes Sfio, a new input/output library, that
    can be used as a replacement for Stdio, the C language standard I/O
    library.  Sfio is more complete, consistent, and efficient than Stdio.  New
    facilities are provided for convenient, safe and efficient manipulation of
    data streams.  An Sfio stream may be entirely memory resident or it may
    correspond to some actual file.  Alternative I/O disciplines can be applied
    to a stream to customize its behavior with respect to data transformation
    and exception handling.  Stream pools can be maintained to guarantee stream
    synchronization when switching streams for I/O operations.  Separate
    streams can be stacked on one another to make new virtual streams.  Both
    source and binary compatibility packages are provided allowing Stdio-based
    programs to benefit from the new library without recoding.  Sfio has been
    used successfully in a number of applications including many rewritten
    standard system utilities.  Sfio Benchmark timings show that performs very
    well against Stdio and standard utilities can gain substantial performance
    improvement when based completely on Sfio.", 
  location     = "https://www.cs.princeton.edu/courses/archive/fall97/cs595/sfio.ps"
}

@InProceedings{amgui,
  author       = "Rob Pike",
  title        = "{A} Minimalist Global User Interface",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "267--280",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "windows, user interfaces, minimalism",
  abstract     = "Help is a combination of editor, window system, shell, and
    user interface that provides a novel environment for the construction of
    textual applications such as browsers, debuggers, mailers, and so on.  It
    combines an extremely lean user interface with some automatic heuristics
    and defaults to achieve significant effects with minimal mouse and keyboard
    activity.  The user interface is driven by a file-oriented programming
    interface that may be controlled from programs or even shell scripts.  By
    taking care of user interface issues in a central utility, help simplifies
    the job of programming applications that make use of a bitmap display and
    mouse.", 
  location     = "http://doc.cat-v.org/plan_9/1st_edition/help/"
}

@InProceedings{igradm,
  author       = "Dean Rubine",
  title        = "Integrating Gesture Recognition and Direct Manipulation",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "281--298",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "gesture-based interfaces, statistical classification, user
    interfaces",
  abstract     = "A gesture-based interface is one in which the user specifies
    commands by simple drawings, typically made with a mouse or stylus.  A
    single intuitive gesture can simultaneously specify objects, an operation,
    and additional parameters, making gestures more powerful than the clicks
    and drags of traditional direct-manipulation interfaces.  However, a
    problem with most gesture-based systems is that an entire gesture must be
    entered and the interaction completed before the system responds.  Such a
    system makes it awkward to use gestures for operations that require
    continuous feedback.  GRANDMA, a tool for building gesture-based
    applications, overcomes this shortcoming through two methods of integrating
    gesturing and direct manipulation.  First, GRANDMA allows views that
    respond to gesture and views that respond to clicks and drags (e.g.
    widgets) to coexist in the same interface.  More interestingly, GRANDMA
    supports a new two-phase interaction technique, in which a gesture
    collection phase is immediately followed by a manipulation phase.  In its
    simplest form, the phase transition is indicated by keeping the mouse still
    while continuing to hold the button down.  Alternatively, the phase
    transition can occur once enough of the gesture has been seen to recognize
    it unambiguously.  The latter method, called eager recognition, results in
    a smooth and natural interaction.  In addition to describing how GRANDMA
    supports the integration of gesture and direct manipulation, this paper
    presents an algorithm for creating eager recognizers from example
    gestures.", 
  location     = "http://ra.adm.cs.cmu.edu/anon/itc/CMU-ITC-100.pdf"
}

@Article{asfsarpoacl,
  author       = "Jan Stelovsky and Hirotsugo Sugaya",
  title        = "{A} System for Specification and Rapid Prototyping of Application Command Languages",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 7,
  pages        = "1023--1032",
  month        = jul,
  keywords     = "software tools, programming environments, user interfaces,
    rapid prototyping, application command languages, XS-2 system, application
    dialogs, command language grammar, nonprocedural description language,
    regular expressions, command specification, command tree, automatic
    translation, Modula-2", 
  abstract     = "The XS-2 system that integrates specification, rapid
    prototyping, and the actual use of application dialogs is described.  The
    XS-2 command language grammar, a nonprocedural description language based
    on regular expressions, is used to specify commands for any application
    program.  The syntax of the command specification is visible to the user:
    command names and their activation rules are displayed as a command tree.
    Since a small set of tools is provided for the development of the command
    specification and its automatic translation into a prototype application
    module in Modula-2, no programming work is necessary to design and evaluate
    the commands.  Experience shows that an advanced end user can develop his
    or her own prototype application without a programmer's assistance.", 
  location     = "https://doi.org/10.1109/32.42742"
}

@Article{plfcmspac,
  author       = "Loy, Gareth and Abbott, Curtis",
  title        = "Programming Languages for Computer Music Synthesis, Performance, and Composition",
  journal      = surveys,
  year         = 1985,
  volume       = 17,
  number       = 2,
  pages        = "235--265",
  month        = jun,
  keywords     = "computer music, digital sound synthesis, music programming
    language design, music representation, real-time control languages,
    object-oriented structures, temporal sequencing",
  abstract     = "The development of formal, descriptive, and procedural
    notations has become a practical concern within the field of music now that
    computers are being applied to musical tasks.  Music combines the real-time
    demands of performance with the intellectual demands of highly developed
    symbolic systems that are quite different from natural language.  The
    richness and variety of these demands makes the programming language
    paradigm a natural one in the musical application of computers.  This
    paradigm provides musicians with a fresh perspective on their work.  At the
    same time, music is a very advanced form of human endeavor, making computer
    music applications a worthy challenge for computer scientists.  In this
    paper we outline the traditional tasks and forms of representation in
    music, then proceed with a survey of languages that deal with music
    programming.", 
  location     = "https://doi.org/10.1145/4468.4485"
}

@Article{spaocbttp,
  author       = "Gazzillo, Paul and Grimm, Robert",
  title        = "{SuperC}:  Parsing All of {C} by Taming the Preprocessor",
  journal      = sigplan # "(" # pot # "33rd ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '12)",
  year         = 2012,
  volume       = 42,
  number       = 6,
  pages        = "323--334",
  month        = jun,
  keywords     = "c, preprocessor, parsing, conditional macros",
  abstract     = "C tools, such as source browsers, bug finders, and automated
    refactorings, need to process two languages: C itself and the preprocessor.
    The latter improves expressivity through file includes, macros, and static
    conditionals.  But it operates only on tokens, making it hard to even parse
    both languages.  This paper presents a complete, performant solution to
    this problem.  First, a configuration-preserving preprocessor resolves
    includes and macros yet leaves static conditionals intact, thus preserving
    a program's variability.  To ensure completeness, we analyze all
    interactions between preprocessor features and identify techniques for
    correctly handling them.  Second, a configuration-preserving parser
    generates a well-formed AST with static choice nodes for conditionals.  It
    forks new subparsers when encountering static conditionals and merges them
    again after the conditionals.  To ensure performance, we present a simple
    algorithm for table-driven Fork-Merge LR parsing and four novel
    optimizations.  We demonstrate the effectiveness of our approach on the x86
    Linux kernel.", 
  location     = "",
  location     = "https://cs.nyu.edu/rgrimm/papers/pldi12.pdf"
}

@Book{cpec,
  author       = "Paul~E. Ceruzzi",
  title        = "Computing",
  subtitle     = "A Concise History",
  publisher    = mitp,
  year         = 2012,
  address      = cma,
  keywords     = "analog machines, digital machines, stored program machines, history,
    microprocessors, the internet, the world wide web",
  location     = "QA 76.C467"
}

@Book{twswb,
  author       = "Sara Wachter-Boettcher",
  title        = "Technically Wrong",
  publisher    = "W.~W. Norton",
  year         = 2017,
  address      = nyny,
  keywords     = "culture, user experience, tracking, algorithms, meritocracy",
  location     = "TA 169.5.W33"
}

@Book{cswsm,
  author       = "Sayaka Murata",
  title        = "Convenience Store Woman",
  publisher    = "Grove Press",
  year         = 2018,
  address      = nyny,
  keywords     = "alienation, conformance, norms, commerce, work, personality",
  location     = "PL 873.U73 C6613"
}

@Misc{1mmmitxss,
  author       = "Michael Steil",
  title        = "17 Mistakes {Microsoft} Made in the {Xbox} Security System",
  booktitle    = "22nd Chaos Communication Congress (22C3)",
  year         = 2005,
  month        = "27--30 " # dec,
  address      = "Berlin, Germany",
  keywords     = "security, xbox, bootloader, encryption, hashing, ",
  location     = "https://events.ccc.de/congress/2005/fahrplan/attachments/674-slides_xbox.pdf",
  location     = "https://www.slideshare.net/Flashdomain/17-mistakes-microsoft-made-in-the-xbox-security-system"
}

@Misc{asjsc,
  author       = "Stringfellow Barr",
  title        = "Notes on Dialogue",
  year         = 1968,
  month        = jan,
  keywords     = "listening, dialogue, communication",
  location     = "https://www.bc.edu/content/dam/files/centers/boisi/pdf/f10/Notes_on_Dialogue.pdf"
}

