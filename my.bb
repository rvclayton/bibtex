.so bibtex.header
		  
@string{usenixs89 = pot # "Summer 1989 USENIX Conference"}
@string{usenixw90 = pot # "Winter 1990 USENIX Conference"}
@string{pldi12 = sigplan # " (" # pot # "33rd ACM SIGPLAN Conference on Programming Language Design and Implementation, PLDI '12)"}
@string{asplos89 = sigplan # " (" # pot # "Third International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS '89)"}
@string{ppeals88 = sigplan # " (" # pot # "ACM\slash SIGPLAN Conference on Parallel Programming: Experience with Applications, Languages and Systems, PPEALS '88)"}
		  
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

@InProceedings{asycrbycth,
  author       = "Sanjay Manandhar",
  title        = "{Activity Server}: You can run but you can't hide",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "299--312",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "location awareness, the panopticon, finger",
  abstract     = "The activity server is a software utility that provides
    high-level information on what a user or a number of users are doing by
    combining data inputs from various sources.  These sources are: 1)
    thejinger server, 2) the phone server, and 3) the location server.  The
    finger server provides information on users' activities or lack thereof on
    hosts within a local network; the phone server abstracts information from
    call progress of users' digital phones whereas the location server
    abstracts information from active badge sightings.  Responses from all
    these unobtrusive data gathering sources are put together to form a
    composite model of the activities of users.  Information may be collected
    only from or on behalf of participating users; each user within the user
    community can determine how much of his own information the activity server
    may receive.  The main attributes of the activity server are: 1) it
    maintains history of all the participating users, 2) it synchronizes among
    the many, possibly conflicting, pieces of information from three sources,
    3) it distinguishes interdependence of activities among users, and 4) it
    provides a high-level abstraction about users' activities.", 
  location     = "https://www.media.mit.edu/publications/activity-server-you-can-run-but-you-cant-hide/"
}

@InProceedings{dcfjvasaiauwe,
  author       = "Bernard~I. Szabo and Gregory~K. Wallace",
  title        = "Design Considerations for {JPEG} Video and Synchronized Audio in a " # unix # " Workstation Environment",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "353--368",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "jpeg, mpeg, video coding, video compression, jpeg video,
    multiplexing, audio encoding, synchronization",
  abstract     = {This article describes design considerations for use of the
    draft ISO JPEG standard as a digital video compression technique, to record
    and play back option images with synchronized compressed audio in a
    Unix-based workstation.  Background discussion is provided on JPEG and why
    it is a strong candidate to become a de facto standard for interactive
    digital video, even though MPEG is the ISO standard primarily intended for
    this purpose.  Examples are given of the data rates and typical
    frame-to-frame variations of JPEG data streams which must be supported by
    real-time software.  A simple audio coding algorithm is described, along
    with a video/audio multiplexed encoding scheme, which was designed both as
    a practical starting format for JPEG video, and as a vehicle for initial
    investigation of the more complex MPEG systems multiplexed encoding format.
    A description of the hardware testbed designed for our experimental work is
    given, and this leads to a discussion of how the task of keeping video and
    audio streams relatively synchronized during playback can be managed with
    minimum burden on the operating system.  Finally, the real-time software
    design which runs on the host Unix workstation is summarized, and key
    issues for system resource management are highlighted.} 
}

@InProceedings{madmae,
  author       = "George~D. Drapeau and Howard Greenfield",
  title        = "{MAEstro} --- {A} Distributed Multimedia Authoring Environment",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "315--328",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "multimedia editing, multimedia documents, system design,
    courseware, loosely-coupled systems, ",
  abstract     = "Current multimedia authoring environments are typically
    designed as self-contained systems; one application is completely
    responsible for the creation of multimedia documents.  The number of media
    supported by such systems is usually small, and accommodating new media
    typically requires rewriting the authoring system.  Meanwhile, workstation
    vendors are adding multimedia support to distinguish their products from
    those of their competitors.  As a result, new media are being introduced on
    the workstation platform so quickly that monolithic authoring systems
    incorporating today’s state-of-the-art media are often obsolete within a
    year.  MAEstro was designed for extensibility.  The key to MAEstro is its
    inter-application messaging system, similar to NeXT’s Speaker-Listener
    protocol [1].  Through the messaging system, an authoring application
    controls a number of “mediaeditors” (applications responsible for the
    manipulation of a particular medium or source of information).  When
    creating a multimedia document, the authoring application asks the media
    editors for information about their current selections; during playback,
    the authoring application sends messages to the media editors telling them
    to perform media selections.  At present, MAEstro consists of a suite of
    applications on Sun and NeXT workstations.  Media editors on the Sun
    support text, CD audio, videodiscs, and a text search engine.  The NeXT
    runs a MIDI music editor.  The authoring application is a timeline editor
    running on the Sun that allows authors to create multimedia documents using
    any combination of media on both workstations.  For example, an author can
    create a multimedia document that synchronizes NeXT-controlled MIDI
    synthesizers with video controlled by the Sun.", 
  location     = "http://www.transcode.com/sites/default/files/ProductInfo/IntroPaper.ps.gz"
}

@InProceedings{nmmapc,
  author       = "Walter Bender and H{\aa}kon Wium Lie and Jonathan Orwant and Laura Teodosio and Nathan Abramson",
  title        = "Newspace:  Mass Media and Personal Computing",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "329--348",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "digital media, news delivery, personalization, news gathering",
  abstract     = {This study describes the implementation of a display
    application, Newspace, that offers a broadsheet-sized electronic news
    presentation to the reader.  The use of paper-quality displays coupled with
    personal computing gives us a range of new possibilities in content
    selection, imagery, typography, and human interaction.  A computational
    intermediary, acting in concert and on behalf of the reader makes possible
    new publishing styles and forms.  Newspace invites instant updates and
    spontaneous interaction, while retaining the notion of the edition, with a
    front page, headlines, simultaneous presentations and juxtapositions.  The
    application is not limited to traditional news retrieval.  The news is
    augmented with information from local and remote databases, including
    electronic mail.  This compilation of data is presented in the style of
    news media, complementing rather than supplanting it.  The combination and
    juxtaposition of multiple forms of media is being explored.  Salient
    features of news stories, such as the non-lexical cues in audio and video
    news, are abstracted and stored in a database.  The information is used in
    augmentation and linking to stories in remote databases, to translate
    information across media types, and to display the news in styles amenable
    to individual users.  Further personalizing is accomplished by maintaining
    dynamic user models.  These models include information such as the user's
    schedule and topics of interest.  The system monitors user actions to
    bolster both precision and accuracy of the model over time.} 
}

@InProceedings{svuu,
  author       = "Paul~G. Milazzo",
  title        = "Shared Video under " # unix,
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "369--383",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "interactive video, video hardware, video applications,
    network video servers",
  abstract     = "The BBN Video Information Server, constructed by the
    Multimedia System Group, serves several video workstations in nearby
    offices.  The server and workstations are both based on a combination of
    Unix workstations and Amiga personal computers, and communicate using a
    special video-request protocol layered atop SUNRPC.  The server supports a
    wide variety of video applications, including interactive video browsers
    and editors, programs that use moving images as user-interface objects, and
    programs that automatically index video that has closed captions.  Our
    experience suggests improvements both in Unix and in workstation hardware.
    Native support for bandwidth-reservation protocols and multicasting, and
    synchronization primitives for character I/O devices would be invaluable,
    as would better clocks." 
}

@InProceedings{ewacutxwsuati,
  author       = "Robert Terek and Joseph Pasquale",
  title        = "Experiences with Audio Conferencing Using the {X Window System}, " # unix # ", and {TCP/IP}",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "405--418",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "audio conferencing, x window system, delay, performance
    measurement",
  abstract     = "We present a voice-quality audio conferencing system built
    using standard system software, specifically the SunOS 4.0 version of UNIX,
    X11, and TCP/IP on an Ethernet.  Since this software does not provide real
    time guarantees, we describe a simple strategy for recovering from missed
    deadlines by discarding late audio data.  Using this strategy, conferences
    proceed without delay entering into conversations.  To simplify application
    programming, a key part of the conferencing system is an X11 server
    modified to accept audio requests.  This not only provides network
    transparent access to audio devices, but also has implications for
    synchronizing audio with graphics or any other media that an enhanced X11
    server may process.  In this study, we describe the structure of the
    conferencing application and X11 server and then characterize the
    performance of this system." 
}

@InProceedings{ceaeits,
  author       = "Mark Taunton",
  title        = "Compressed Executables:  an Exercise in Thinking Small",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "385--403",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "data compression, code compression",
  abstract     = "In the project described in this paper, a large body of
    software --- including a port of 4.3 BSD, Sun NFS and the X Window System
    --- has been made to fit onto small personal computers with comparatively
    tiny discs and an unusual memory management architecture.  The problem of
    space is exacerbated by the relatively low code density of the RISC
    processor used, and an enormous hardware-imposed page size might well be
    expected to make matter worse.  Part of the solution is an implementation
    of shared libraries.  In addition, considerable savings, of both disk space
    and other resources, are obtained by applying a specialized data
    compression technique to demand-paged executable files.  This is done in
    such a way that the compressed programs are still runnable.  In the process
    the huge page size is turned to advantage by utilizing a standard feature
    of the UNIX file system.  Some additions to the kernel, a few extra
    utilities, and some minor changes in the standard toolkit support the
    scheme.  We briefly explain the background to this work, and outline the
    shared library mechanism.  The remainder of the paper focuses on the
    concept of compressing executable code, examining its advantages and its
    limitations.  We suggest possibilities for further improvement of the
    current implementation, and also some ways in which the technique might be
    exploited in a broader context." 
}

@InProceedings{iaatiadwe,
  author       = "Susan Angebranndt and Richard~L. Hyde and Daphne Huetu Luong and Nagendra Siravara and Chris Schmandt",
  title        = "Integrating Audio and Telephony in a Distributed Workstation Environment",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "419--435",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "audio servers, audio device management",
  abstract     = "More and more vendors are adding audio, and occasionally
    telephony, to their workstations.  At the same time, with the growing
    popularity of window systems and mice, workstation applications are
    becoming more interactive and graphical.  Audio provides a new dimension of
    interaction for the user, and the possibility of a powerful new data type
    for multi-media applications.  This paper describes our architecture for
    the integration of audio and telephony into a graphics workstation
    environment.  Our framework is a client-server model; at the heart is an
    audio server that allows shared access to audio hardware, provides
    synchronization primitives to be used with other media and presents a
    device-independent abstraction to the application programmer.", 
  location     = "https://www.media.mit.edu/speech/papers/1991/angebranndt_USENIX91_integrating_audio.pdf"
}

@InProceedings{pefmd,
  author       = "Matthew~E. Hodges and Russell~M. Sasnett",
  title        = "Plastic Editors for Multimedia Documents",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "463--473",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "multimedia documents, multimedia editors, configurable
    editors, active documents",
  abstract     = {This paper describes our research with plastic editors in the
    Visual Computing Group of MIT's Project Athena.  The idea of plastic
    editors is to break down the distinction between editor (program) and
    document (data), to enable the manufacture of editors which can be molded
    and shaped to meet many different needs.  The Athena Muse authoring system
    allows us to experiment with the idea of building editing tools out of the
    components provided in the authoring system itself.  In this paper we
    describe the importance of mutable editors in an application environment,
    the basic dimensions of plasticity in editors, and some examples of how we
    built and modified the Muse editing tools.}
}

@InProceedings{awbmmefbt,
  author       = "Keishi Kandori",
  title        = "{A} Workstation-based Multi-media Environment for Broadcast Television",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "455--461",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "modeling, sports, video processing, visualization, data acquisition",
  abstract     = "This presentation will describe two applications which
    illustrate expanding workstation power in the real broadcasting world.  One
    is a sophisticated application of virtual reality in which we simulated the
    environment of the green of the 18th whole in a real time during a real
    professional golf tournament for a broadcast TV program.  The other is
    professional baseball information management system for TV program
    production in which we incorporated distributed computing, mixed
    networking, database managing, and computer graphics." 
}

@InProceedings{abootddcs,
  author       = "Newman-Wolfe, R.~E. and Ramirez, C.~L. and Pelimuhandiram, H. and Montes, M. and Webb, M. and Wilson, D.~L.",
  title        = "{A} Brief Overview of the {DCS} Distributed Conferencing System",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "437--461",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "groupware, conference management, application managers",
  abstract     = "The Distributed Conferencing System (DCS) at the University
    of Florida is a distributed package providing real-time support for
    cooperative work.  In this system, a set of mechanisms for conference
    management supports a wide range of floor control paradigms.  The small,
    flexible message-passing interface to the conferencing management processes
    permits shared applications to be installed easily in DCS.  Currently, DCS
    has applications that support concurrent development of text and graphic
    documents; remote demonstration, testing and debugging of programs; and
    automatic creation of transcripts of meetings including motions made and
    voting results." 
}

@InProceedings{awblbsfkma,
  author       = "T.~Paul Lee and R.~E. Barkley",
  title        = "{A} Watermark-based Lazy Buddy System for Kernel Memory Allocation",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "1--13",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "storage management, buddy allocation, lazy allocation, streams",
  abstract     = "In this paper we describe a watermark-based lazy control
    policy of the buddy system for managing unix kernel memory space.  This
    policy achieves low operational costs by capitalizing on the steady-state
    behavior of memory demands.  The lazy control policy maintains watermark
    indices to track the use of buffers for each size.  Depending on these
    indices, the policy can be in lazy mode, reclaiming mode, or accelerated
    mode when dealing with buffer coalescing.  We incorporate a damping
    mechanism in the coalescing process by anticipating that the buffer will
    soon be re-used, and an acceleration mechanism that lets the policy detect
    and react to shifting memory demands.  The controls to these mechanisms are
    distributed over each class of buffer size; such distributed controls are
    particularly attractive when the costs of maintaining global information
    and control are prohibitive.  We present results and comparisons of
    experiments conducted on a prototype lazy buddy system used to manage unix
    system streams buffers.  The costs of buffer operations under the lazy
    control policy are consistently lower than those under the standard buddy
    system with only a slight increase in blocking probability." 
}

@InProceedings{oobcis,
  author       = "Stephen Rago",
  title        = "Out-Of-Band Communication in {STREAMS}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "29--37",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "out-of-band signaling, streams, backward compatibility",
  abstract     = "The STREAMS mechanism in UNIX System V is a flexible
    networking software development framework.  However, STREAMS makes little
    provision for the out-of-band communication facilities found in many
    contemporary protocols.  This paper describes enhancements to STREAMS that
    provide the underlying support for out-of-band communication.  The reader
    is assumed familiar with STREAMS." 
}

@InProceedings{aewnsl,
  author       = "Vaidy~S. Sunderam",
  title        = "An Experiment with Network Shared Libraries",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "39--49",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "shared libraries, x window system, rpc",
  abstract     = "Library routines, ranging from isolated formatters to
    complete software packages are used by virtually every program.  Under
    several circumstances, it is beneficial and even desirable for a 'library
    server' on a remote machine to provide such functions to multiple clients
    that share this service.  This paper describes the design, implementation
    and experience gained in the deployment of such a server on a local network
    of independent workstations.  While the network shared library is premised
    on the basic RPC concept, extensions have been needed to support the
    preservation of state across calls, client and server failures, and server
    multiplexing.  A network shared library for the X Window System has been
    implemented and tested; with the server on a fast processor, multiple
    clients have been observed to run at higher speeds with the added benefits
    of reduced memory and processing overheads on the client machines." 
}

@InProceedings{dpilcums,
  author       = "F. Bonomi and P.~J. Fleming and P.~D. Steinberg",
  title        = "Distributing Processes in Loosely-Coupled " # unix # " Multiprocessor Systems",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "61--72",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "process scheduling, multiprocessors, load balancing",
  abstract     = "We describe a method for distributing processes in a
    loosely-coupled Unix computing environment.  Focusing on the exec() system
    call in the AT&T 3b4000 Computer System running the UNIX System V Release
    3.1.5 Operating System, we discuss design and implementation techniques for
    process migration, the role of stub processes, as well as a novel
    load-balancing process assignment algorithm.  We explain the stages of the
    exec() system call and show the method for migrating a process by
    constructing its new image on a different processor with the cooperation of
    all other processors comprising the extended process.  Selection of the
    recipient processor is critical to load-balancing, so we discuss an
    algorithm that is an adaptive version of the Join-the-Biased-Queue policy.
    The algorithm utilizes a combination of the available instantaneous
    information about the number of processes on each processor and
    periodically collected average CPU run-queue length information as indices
    of load to make the assignment decision.  A performance comparisons of
    three different process assignment algorithms is included to demonstrate
    the efficiency of our approach." 
}

@InProceedings{aodmbacg,
  author       = "Denise Ondishko",
  title        = "Administration  of Department Machines by a Central Group",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "73--82",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "system administration, contractarians, unix",
  abstract     = "Like most other universities, the University of Rochester has
    seen a rapid growth in departmentally owned machines running a version of
    the Unix operating system.  Each department typically has a special task
    required of its machine.  In addition, each department desires control over
    its own resources.  By providing a centrally trained group of system
    programmers a university can avoid duplication of effort and education on
    the part of many departmental system programmers.  However, tie needs of
    the central programmer and the departmental programmer conflict: it would
    be easiest for the departmental programmer to make any changes at any time
    and it would be easiest for the central programmer if all of the machines
    looked identical and did not change unpredictably.  The University of
    Rochester Computing Center has developed a method of resolving these
    differences through a contract of services and responsibilities which
    specify areas of the operating system which must only be modified by the
    central system programmers and areas of the system which are the exclusive
    responsibility of the department programmer.  The department programmer
    must conform the system usage somewhat to a central norm in order to get
    the benefits of central administration.  However, unlike most centrally
    administered sights, system changes are initiated by the department
    administrator rather than by the central group.  This paper will describe
    the keys to the success of the support contracts." 
}

@InProceedings{oaolcsfu,
  author       = "Thomas~J. Coppeto and Beth~L. Anderson and Daniel~E. {Geer, Jr} and G.~Winfield Treese",
  title        = "{OLC}:  An On-Line Consulting System for " # unix,
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "83--94",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "help systems, project athena",
  abstract     = "Helping users learn the intricacies of UNIX1, particularly in
    a custom environment, is always a challenge.  Helping thousands of users in
    an environment that is distributed both geographically and computationally
    is especially difficult.  Project Athena has developed an “On-Line
    Consulting” system (OLC) that enables users to ask questions of consultants
    located “somewhere on the network.” OLC allows a staff on the order of
    twenty students to handle the questions and problems of over 8000 users on
    a network of more than 900 workstations.  This paper describes the motives
    and design goals for OLC, its implementation, and some of the results of
    its three years of operation.", 
  location     = "http://dx.doi.org/10.1145/73760.73814"
}

@InProceedings{adrafus,
  author       = "Griffith~G. {Smith, Jr.}",
  title        = "{A} Distributed Resource Allocator for " # unix # " Systems",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "95--108",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "resource allocation, deadlock avoidance, system management",
  abstract     = "Unix System users have had to tolerate insecure access to
    nonsharable resources such as cartridge units, tape drives and printers.
    As commercial applications for Unix System software become common, more
    security will be a critical requirement.  Software vendors price or
    restrict the number of concurrent users of their licensed software.  These
    license terms are often difficult to enforce.  A resource allocate can
    address both problems.  This paper describes a working prototype of a
    distributed resource allocate suitable for systems connected by a network.
    Its design is unusual in that there is no single place where a resource a
    resource allocation database is maintained.  Instead, servers keep
    information that is of local interest.  Clients set up a network
    connections to groups of servers and then negotiate among the servers for
    the right to allocate resources.  The servers dynamically configure
    themselves into negotiation groups; allocation requests within a group are
    queued, requests to unrelated groups can be processed in parallel.  For a
    single system, a robust resource allocate is simple to implement, but a
    design of an allocate for a cluster of systems connected by a network is
    difficult; there are many opportunities for partial failure and incorrect
    behavior.  The allocate achieves a significant level of fault tolerance by
    exploiting the redundancy of the information stored on multiple servers ad
    by avoiding architecture that is vulnerable to faults.  Negotiation
    protocols combine the distributed information and ensure that a 'correct'
    decision will be made even when some of the servers fail or have
    inconsistent status." 
}

@InProceedings{aupifcbagws,
  author       = "Marc~J. Rochkind",
  title        = "{A} Unified Programming Interface for Character-Based and Graphical Window Systems",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "109--117",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "curses, ui, graphics portability, character-based io",
  abstract     = "Must Unix programmers today sit at character-based terminals,
    and most of the user interfaces they develop, even for brand-new
    applications, are character-based.  Yet, almost everyone agrees that future
    user interfaces will be graphical.  Unfortunately, few character-based
    applications will migrate easily to graphical window systems (such as X)
    because the graphical systems use even-driven programming models that are
    quite different from traditional character-based models, and because
    graphical systems use an entirely different application program interface.
    The solution is to use a character-based window system that follows the
    programming model used by the graphical systems and that has the same
    programming interface.  The Extensible Virtual Toolkit (XVT) interface is a
    good choice, because it already permits portability to several popular
    graphical window systems.  This paper reviews the evolution of Unix user
    interfaces and explains why most developers can't use graphical interfaces
    today.  Then it surveys the XVT programming interface and indicates the
    degree to which it can be mapped into a character-based model.  Finally,
    the construction of the character-based system is briefly described." 
}

@InProceedings{ahwxsnw,
  author       = "Mark Opperman",
  title        = "At Home With {X11}\slash {NeWS} Windows",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "119--131",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "window systems, serial-line protocols, compression",
  abstract     = "The X11/NeWS server has been modified to support X11 and NeWS
    clients across a serial interface providing remote access to window-based
    applications.  The Unix system services required by the X11/NeWS server
    have been isolated into a helper process that runs on the host to which the
    window serve connects.  A reliable, full-duplex, channel-based protocol
    provides the link between the window server and the helper process.
    Pre-allocated channels are used tor system services (e.g., open, close,
    spawn) and dynamically allocated channels are used to multiplex data
    streams from the different window client applications.  Data transmitted
    between the window server and the helper process are compressed using the
    adaptive Limpel-Ziv technique.  Prototype versions of the server run on an
    ATARI ST and on Sun workstations with surprisingly good performance for
    both NeWS and X11 clients at baud rates as low as 2400." 
}

@InProceedings{iusaidisd,
  author       = "Ehrlich, Kate and Stanley, Barbara and Shea, Tim",
  title        = "Incorporating Usability Studies and Interface Design into Software Development",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "133--145",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "prototyping, user-interface studies, design feedback, user experience",
  abstract     = "The new graphical file manager on the Sn386i, Sun Organizer,
    was designed to provide easy access to file system and network operations
    for people unfamiliar with the Unix operating system.  The graphical
    interface to Organizer supported a direct manipulation style of
    interaction, a clean graphic design and plenty of user feedback.  In order
    to verify that Organizer was easy to use by the target audience, we
    conducted a study in which a representative group of users followed a
    self-administered tutorial.  This introduced them to basic operations such
    as changing directories, selecting files, deleting and adding files and
    moving/copying files between directories.  Although these users were
    enthusiastic about Organizer and completed the tutorial successfully, there
    were several instances where the behavior of the application did not match
    the user's expectations.  Many of these mismatches were corrected in the
    final product resulting in a smoother, more efficient interface.  Users
    also appreciated the emphasis on active learning.  For novice users
    especially, being given an explicit set of procedures to follow can help
    overcome limits in the rate of assimilating hew information.", 
  location     = "https://doi.org/10.1145/108844.109008"
}

@InProceedings{t3dfs,
  author       = "David~G. Korn and Eduardo Krell",
  title        = "The 3-{D} File System",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "147--156",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "file systems, file versioning, virtual paths",
  abstract     = "Traditional version control mechanisms in the Unix System
    have serious drawbacks.  They work only on ASCII files and are encapsulated
    systems which do not fit nicely with the rest of the tools in the Unix
    systems.  Sharing of file is not possible, as programmers have to make
    their own private copies when they want to work on different versions of a
    file.  The memorandum describes a powerful versioning mechanism which
    allows users to view different versions of files in a Unix file system and
    allows multiple programmers to work on different versions of the software
    simultaneously, without having to make private copies of the files
    involved.  This capability, now in prototype form, extends the concept of
    versioning to systems rather than files and to files with arbitrary format
    (e.g.  object files and libraries) rather than only line oriented ASCII
    files (e.g.  source code).  We have extended the concept of viewpathing in
    a way that is transparent to all programs without requiring any changes.
    The current implementation is a user-level library which can be used to
    relink any program or command which is to understand versions and
    viewpathing.  No changes need to be made to the user programs." 
}

@InProceedings{aefhw,
  author       = "Glenn~S. Fowler and David~G. Korn and K.-Phong Vo",
  title        = "An Efficient File Hierarchy Walker",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "173--188",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "system utility, file system, tree walking",
  abstract     = "This paper presents an interface specification and an
    efficient implementation of a general purpose library routine, ftwalk, to
    traverse a UNIX* file system hierarchy.  A number of standard file system
    utilities, e.g., find, ls, rm, and others have been reimplemented using
    ftwalk.  The total source code size is 30% smaller and the efficiency of
    all commands improves.  More importantly, these commands now handle the
    file system search in a uniform, robust, and secure manner.  New tools have
    been built with ftwalk.  A file system perusing tool, tw, will be
    described.  tw subsumes the functionality ofﬁfind and xargs.  Further, it
    provides a powerful expression language with a syntax similar to C.  For
    typical applications in which commands are executed on generated file
    names, tw is 5 to 10 times faster than find.  The combination of a powerful
    language and performance efficiency in tw should reduce the practice of
    adding directory recursion to commands.", 
  location     = "http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.119.7085&rep=rep1&type=pdf"
}

@InProceedings{soti9hcrfsihu,
  author       = "Ping-Hui Kao and Bill Gates and Bruce Thompson and Dale McCluskey",
  title        = "Support of the {ISO}-9660/{HSG} {CD}-{ROM} File System in {HP}-{UX}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "189--202",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "file systems, vnodes, cd-roms",
  abstract     = "The ISO-9660 standard and High Sierra Group (HSG) working
    paper describe file system formats for publication and distribution of
    information on CD-ROM (Compact Disk Read Only Memory) media.  This paper
    describes Hewlett-Packard's design and implementation of support for the
    ISO-9660/HSG CD-ROM file system (CDFS) in the HP-UX kernel.  After mounting
    a CD-ROM which adheres to the standard, files on the CD-ROM are accessible
    through the normal system calls and commands allowing users and application
    programs to take advantage of the high capacity and low duplication cost of
    this medium without the need for any special programmatic interface.  The
    first sections a brief overview of CD-ROM history and the ISO-9660/HSG file
    system format.  The design goals, design philosophy, and testing strategy
    will then be presented followed by some examples of how this new feature
    will be used in HP-UX systems.  The paper will conclude with a discussion
    of the results of the project and possible enhancements to the design." 
}

@InProceedings{safdacfubg,
  author       = "Jeffrey~C. Mogul",
  title        = "Simple and Flexible Datagram Access Controls for Unix-based Gateways",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "203--221",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "user-space filtering, application gateways, system calls",
  abstract     = "Internetworks that connect multiple organizations create
    potential security problems that cannot be solved simply by internal
    administrative procedures.  Organizations would like to restrict
    inter-organization access to specific restricted hosts and applications, in
    order to limit the potential for damage and to reduce the number of systems
    that must be secured against attack.  One way to restrict access is to
    prevent certain packets from entering or leaving an organization through
    its gateways.  This paper describes simple, flexible, and moderately
    efficient mechanisms for screening the packets that flow through a
    Unix-based gateway.", 
  location     = "http://www.hpl.hp.com/techreports/Compaq-DEC/WRL-89-4.pdf"
}

@InProceedings{nmbd,
  author       = "Goldszmidt, German and Yemini, Yechiam and Yemini, Shaula",
  title        = "Network Management by Delegation",
  booktitle    = pot # "1991 Conference of the Centre for Advanced Studies on Collaborative Research, CASCON '91",
  year         = 1991,
  editor       = "Ann Gawam and Jan~K. Pachl and Jacob Slonim and Anne Stilman",
  pages        = "347--361",
  publisher    = "IBM Press",
  address      = "Toronto, Ontario, Canada",
  month        = "28--30 " # oct,
  keywords     = "cmip, protocol expressiveness, remote delegation, scripting,
    coordination, agent architecture", 
  abstract     = "Network management systems built on a client/server model
    centralize responsibilities in client manager processes, with server agents
    playing restrictive support roles.  As a result, managers must micro-manage
    agents through primitive steps, resulting in ineffective distribution of
    management responsibilities, failure-prone management bottlenecks, and
    limitations for real time responsiveness.  We present a more flexible
    paradigm, the Manager-Agent Delegation (MAD) framework.  It supports the
    ability to extend the functionality of servers (agents) at execution time,
    allowing flexible distribution of management responsibilities in a
    distributed environment.  MAD can store and instantiate delegated scripts,
    and provides a concurrent runtime environment, where they can execute
    asynchronously without requiring the manager's intervention.  A delegation
    protocol allows a manager to transfer programs, create process instances,
    and control their execution.  We describe the delegation model, its
    application to network management, and the design of a prototype
    implementation." 
}

@InProceedings{stoascup,
  author       = "Janet~A. Cugini and Shau-Ping Lo and Matthew~S. Hecht and Radhakrishna Aditham and T.~John Wei",
  title        = "Security Testing of {AIX} System Calls Using {Prolog}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "223--237",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "security testing, orange book, operating systems, unix
    operating system, unix system calls, operating system security, computing
    security, prolog, logic programming",
  abstract     = "We wrote security test plans and, using Prolog, and automated
    security testing system for C2 security testing of AIX version 2.2.1 system
    calls.  AIX 2.2.1 is a version of the UNIX operating system that runs on
    the IBM rt PC hardware and that contains security features (for the base
    operating system and TCP/IP) designed to satisfy the C2 security
    requirements and the B3 trusted path requirement.  The notable design
    features of our work include: (1) it is based on the gray box security
    testing method; (2) the security test plans contain both converge analysis,
    which explains why the test conditions are sufficient and why the test data
    cover the test conditions, and system call test environment dependency
    analysis; (3) the security testing system is comprehensive in that it
    automates all aspects of security testing except for writing security test
    plans and adding, per system call, a set of facts and rules that cover
    system call syntax, text conditions, and expected outcomes; and (4) this
    work is also suitable for security testing of UNIX system calls for higher
    security issues.  We explain what motivated the Prolog security testing
    system approach, discuss how we write security test plans, sketch the
    structure of the security testing system, and provide qualitative
    experience with the approach to security testing.  From this experience and
    the Secure XENIX project experience, we conclude that comprehensive
    security testing of UNIX system calls with an automated security testing
    system in Prolog is preferable to writing and maintaining security test
    programs manually written in the C programming language." 
}

@InProceedings{faaptabltu,
  author       = "Jon~F. Spencer and Jackie McAlexander",
  title        = "Factors Affecting Application Portability to a {B1} Level Trusted " # unix,
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "239--255",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "portability, trusted computing base, performance",
  abstract     = "With the increasing use of operating systems which have been
    modified to meet multi-level security requirements comes an increasing need
    to port standard Unix applications to these platforms.  This paper
    discusses major changes made to target the B1 level of trustedness.  It
    shows that vendor implementations may may, and that these variations affect
    the portability and performance of existing applications.  The paper takes
    the Unix mail program and discusses several implementation methods on a B1
    system." 
}

@InProceedings{utdsc,
  author       = "Daniel~S. Conde and Felix~S. Hsu and Ursula Sinkewicz",
  title        = "{ULTRIX Threads}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "257--268",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "threads, unix, thread library",
  abstract     = "Two groups at Digital recently collaborated on a prototype
    implementation of threads in ULTRIX, Digital's Unix product.  Threads, or
    lightweight processes, provide a means for applications to control
    complexity and more efficiently utilize uniprocessors and multiprocessors.
    Uniprocessor benefits can be realized by using threads to overlap I/O
    operations with computation, and to cope with complex asynchronous run-time
    environments in a synchronous way.  Multiprocessors allow the additional
    benefit of executing an application's threads concurrently.  A wide variety
    of designs were considered for ULTRIX Threads, beginning with user-level
    threads, and evolving to kernel threads.  The trade-offs between
    lower-level threads and kernel threads are discussed and contrasted with
    other multi-thread systems, both Unix-based and non-Unix based.  Finally,
    the kernel, library, and dbx changes are described in some detail,
    highlighting the trade-offs and decisions made in our final design." 
}

@InProceedings{nanfspb,
  author       = "Barry Shein and Mike Callahan and Paul Woodbury",
  title        = "{NFSStone}:  {A} Network File Server Performance Benchmark",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "269--275",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "network performance, network file systems, nfs, benchmarking",
  abstract     = "Network file servers are becoming a critical facility in
    modern computing environments.  With the growth in their popularity and the
    emergence of multiple vendors providing software products which adhere to
    the same standards comes a need for relative performance measurement of
    different configurations.  We have designed a benchmark and report our
    experiences with it on different configurations of services and clients.
    The benchmark was designed to be portable between networked file system
    protocols and tunable to reflect different disk traffic patterns if
    desired.  The default parameters used were chosen to be similar to the
    traffic patterns of typical networked file system environments as earlier
    reported in [SANDBERG85]." 
}

@InProceedings{uairtpmfusv,
  author       = "Charles Ballance and Sean Fleming and Jay Goldberg and Nelly Karasik",
  title        = "{UFOS}: An Intelligent Real-Time Performance Monitor for " # unix # "{ System V}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "277--286",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "system management, system analysis, performance, monitoring, ui",
  abstract     = "The Unix Facility for the Observation of Systems, UFOS, is an
    intelligent real-time performance monitor for systems running Unix System
    V.  UFOS monitor system-wide activity and alerts the user to potential
    performance problems, indicating what may be wrong and where to look for
    further information.  UFOS is an interactive system designed to assist with
    the analysis of Unix System V performance.  The system can be customized to
    monitor the performance of a particular machine.", 
}

@InProceedings{adfsiaarp,
  author       = "Ronald~E. Barkley and T.~Paul Lee",
  title        = "{A} Dynamic File System Inode Allocation and Reclaim Policy",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "1--9",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "dynamic storage management, inodes, vnodes, virtual storage,
    file systems, caching",
  abstract     = "In this paper we describe a policy for dynamically allocating
    and reclaiming inodes and present some experimental results obtained on a
    System V prototype.  Traditionally, in-core inodes are allocated from a
    statically reconfigured table, and free slots in this table are reused
    based on a LRU reallocation policy.  With a dynamic policy, inodes are
    allocated on demand and cached after use.  We limit the number of inodes by
    reclaiming them when they no longer have any memory pages associated with
    them.  This policy improves the efficiency of the memory subsystem and,
    thus, improves overall system performance.  Dynamically allocating inodes
    also offers the advantage of automatic tuning; we do not need any special
    understanding of the workload to determine the best number of inodes to
    configure." 
}

@InProceedings{iivpsnfp,
  author       = "Danny Chen, Ronald~E. Barkley, T.~Paul Lee",
  title        = "Insuring Improved {VM} Performance:  Some No-Fault Policies",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "11--22",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "virtual memory, page management, process creation, performance",
  abstract     = "",
  location     = ""
}

@InProceedings{iamdfma,
  author       = "Caswell, Deborah and Black, David",
  title        = "Implementing a {Mach} Debugger for Multithreaded Applications",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "25--39",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "debuggers, multi-threaded programming, unix, system calls",
  abstract     = "Multiple threads of control add new challenges to the task of
    application debugging, and require the development of new debuggers to meet
    these challenges.  This paper describes the design and implementation of
    modifications to an existing debugger (gdb) for debugging multithreaded
    applications under the Mach operating system.  It also describes the
    operating system facilities that support it.  Although certain
    implementation details are specific to Mach, the underlying design
    principles are applicable to other systems that support threads in a Unix
    compatible environment." 
}

@InProceedings{panosd,
  author       = "Paul Maybee",
  title        = "pdb: {A} Network Oriented Symbolic Debugger",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "41--52",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network debugging, portability",
  abstract     = "pdb is a symbolic debugger designed to support program
    debugging needs on a network of workstations.  pdb runs under the X Window
    System, reads object files and symbol tables generated by existing (Sun)
    compilers, debugs both local and remote processes, ad works on multiple
    hardware types.  pdb was constructed using object oriented programming
    techniques to improve its portability to new machine types, languages, and
    symbol table formats.  pdb supports debugging at both the source and
    assembly level.  It is entirely mouse and menu driven, with no command
    language or syntax outside of that required to formulate expressions in the
    source language." 
}

@InProceedings{seast,
  author       = "Robert Bedichek",
  title        = "Some Efficient Architecture Simulation Techniques",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "53--63",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "software simulation, lazy allocation",
  abstract     = "An efficient simulator for the Motorola 88000 at the ISA
    (Instruction Set Architecture) level is described.  By translating
    instructions on the fly to a quick-to-execute form we achieve an average
    ratio of 20 simulator host instructions executed per simulated instruction.
    Lazy allocation of memory allows large memories to be modeled with low
    start-up time.  We describe our experience using the simulator to develop
    workstation software.  The simulator's speed and extensive I/O device
    modeling made it possible for us to interactively debug and test a unix
    kernel and diagnostic software well before the hardware was available.
    Extensions to closely model caches and multiprocessors are sketched.", 
  location     = "http://www.xsim.com/papers/bedichek90some.pdf"
}

@InProceedings{touml,
  author       = "Robert Berkley and Skip Gilbrech and Tim Hunt and Mark Luppi and Richard Plevin",
  title        = "Tickerplants on Unix",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "65--74",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "Software tickerplants have long existed in financial
    environments on mainframes and fault-tolerant machines.  Increasingly they
    are being implemented on Unix local area networks as well.  Briefly
    defined, a tickerplant is a software system that receives data from capital
    markets (stock exchanges, commodity exchanges, money market brokers, etc.)
    and distributes it to a user community in real time.  The community can
    include portfolio managers, brokers, traders, and financial analysts.  In a
    sense, one can vie tickerplants as descendants of the old tickertape
    machines, insofar as they are used to place real-time market data on
    financial user's desks.  The resemblance stops there, however.  A
    tickerplant is a composite entity that can be as complex as a commercial
    RDBMS.  The central component of the tickerplant resides on a network
    server machine, where it fills several roles, including: A communications
    handler that interfaces with one or more high-volume data feeds from
    external capital market sources such as stock exchanges.  A real-time
    database manager that stores current status for all market instruments, as
    well as tick-by-tick history for all market transactions.  (Even on
    high-performance machines, no commercial RDBMS can yet sustain market data
    rates).  An information bus manager that distributes data to end-user
    screens and processes that perform real-time analysis of capital markets
    active.  Tickerplants are central to the operation of many financial
    institutions, including funds managers, brokerages, stock exchanges, and
    commercial, clearing, and investment banks.  This paper discusses the
    tickerplant as a unique product that is appearing in Unix based financial
    application environments, after a long history on mainframes and
    fault-tolerant machines.  We focus on the technical constraints and
    solutions for implementing tickerplants on Unix local area networks, and
    highlight the problems i performance, reliability, and network distribution
    based on out experience in implementing our own tickerplant product."
}

@InProceedings{gxgpnnst,
  author       = "Matt Wilson and John Uhley and Upinder Bhalla and David Bilitch and Mark Nelson and James Bower",
  title        = "{GENESIS} \& {XODUS}, General Purpose Neural Network Simulation Tool",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "75--87",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "x system, neural networks, graphical user interface",
  abstract     = "The GENESIS package was created to provide a platform for the
    rapid development of new neural network simulations with geographical user
    interfaces.  Although targeted for the neural network community, the
    interpretive front-end and object-oriented structures present in the
    GENESIS platform illustrate a powerful technique which may be useful in the
    development and implementation of other interactive graphical
    applications." 
}

@InProceedings{kalaegefm,
  author       = "Tim Thompson",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "89--100",
  address      = wdc,
  month        = "22--26 " # jan,
  title        = "Keynote --- {A} Language and Extensible Graphic Editor for Music",
  keywords     = "dsl, music editing, MIDI, unix, little language",
  abstract     = {Keynote is a programming language for manipulating and
    generating music with MIDI-compatible equipment.  It was designed for and
    in the style of the Unix software system: an application-specific little
    language and interactive shell.  Most obviously used for algorithmic music
    composition, Keynote also serves as a more genera utility for real-time and
    non-real-time MIDI data manipulation.  By adding only a few built-in
    functions to the language, a graphic interface was recently added to
    Keynote.  This built-in graphic interface did not, however, build-in any
    particular user interface.  All of the nested pop-up menus and operations
    of a graphical music editor have been implemented in the Keynote language
    itself.  The result is an extensible tool, similar in spirit to the
    Lisp-based extensiblity of Emacs, and easily modified and enhanced by end
    users.} 
}

@InProceedings{iiathds,
  author       = "Joel~S. Emer and William~E. Weihl",
  title        = "Integrated Interactive Access to Heterogeneous Distributed Services",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "101--115",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "rpc, client-server architecture, configurable tooling,
    mercury, elisp",
  abstract     = "In this paper, we consider how to provide interactive users
    with uniform and integrated access to heterogeneous distributed services.
    Access to distributed services through a single interface has many
    advantages.  One is that it provides the user with an integrated interface
    environment that allows easy interaction between uses of distinct services.
    Another is that it simplifies creation of interfaces to new services by
    obviating the need to create a custom interface for that particular
    service.  As a particular instance of such an interface, we examine the use
    of editors as an interface to distributed services.  To date, the means
    provided within editors for accessing services has been relatively ad-hoc.
    In this paper, we examine the more general technique of using remote
    procedure call as the service access paradigm.  This technique is shown to
    have many advantages including: ease of integration of new services;
    allowing for more powerful services since thy can be written in languages
    and on hardware platforms appropriate to the service; and allowing access
    to remote data and access from multiple cites." 
}

@InProceedings{tusmlasr,
  author       = "Joel~D. Silverstein and Steven~E. Sommars and Yio-Chian Tao",
  title        = "The " # unix # " {System} Math Library, a Status Report",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "117--131",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "floating point operations, accuracy, ulp, math library",
  abstract     = "Changes have been made to the Unix System math library (libm)
    to improve accuracy and to conform to standards.  Several improvements were
    made for C/SVR4, most notably in the trigonometric functions, fmod(x, y),
    lgamma(x), pow(x, y), and erfc(x).  Significant improvements come from use
    of some 4.3BSD functions.  While additional algorithmic work is needed to
    improve accuracy and performance of some functions, a more important task
    is to standardize interfaces including exception handling." 
}

@InProceedings{taecl,
  author       = "John~K. Ousterhout",
  title        = "Tcl:  An Embeddable Command Language",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "133--146",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "command interpreters, tool development, scripting languages,
    ipc, extensibility",
  abstract     = "Tcl is an interpreter for a tool command language.  It
    consists of a library package that is embedded in tools (such as editors,
    debuggers, etc.) as the basic command interpreter.  Tcl provides (a) a
    parser for a simple textual command language, (b) a collection of built-in
    utility commands, and (c) a C interface that tools use to augment the
    built-in commands with tool-specific commands.  Tcl is particularly
    attractive when integrated with the widget library of a window system: it
    increases the programmability of the widgets by providing mechanisms for
    variables, procedures, expressions, etc; it allows users to program both
    the appearance and the actions of widgets; and it offers a simple but
    powerful communication mechanism between interactive programs." 
}

@InProceedings{aebfss,
  author       = "Raymond~B. Essick",
  title        = "An Event-based Fair Share Scheduler",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "147--161",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "scheduling, measurement, analysis",
  abstract     = "The PrismaOS scheduler is an event-driven scheduler with fair
    share features.  We implemented this scheduler to replace the standard
    SunOS scheduler for the Prisma P1 system, which is expected to accommodate
    thousands of processes.  Our goals and reasons for implementing a new
    scheduler in PrismaOS instead of using the standard SunOS scheduler
    included: improved interactive responsiveness, scaling to support thousands
    of processes efficiently, and fair share scheduling.  This paper describes
    the PrismaOS scheduler, a modification of the ESCHED scheduler.  It briefly
    covers the changes made to the basic ESCHED algorithms and then details the
    implementation of a far share scheduler on the ESCHED base.  The fair share
    discussion describes our early implementation and the tuning steps we went
    through to produce our final fair share scheduler for PrismaOS.  The new
    scheduler, in its various forms, has been running in production on
    approximately one dozen machines at Prisma since November 1988." 
}

@InProceedings{psampi,
  author       = "Arun Garg",
  title        = "Parallel {STREAMS}: a Multi-Processor Implementation",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "163--176",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "streams, i/o subsystems, multiprocessors, parallelism",
  abstract     = "This paper describes Parallel STREAMS, a multiprocessor
    implementation of STREAMS that has been developed at Sequent.  Parallel
    STREAMS is a key architectural component of the character I/O subsystem of
    the operating system.  Some of the important design issues are discussed.
    Parallelism in the STREAMS context is explored and the design of a parallel
    STREAMS scheduler is described.  Some of the utilities and guidelines that
    were added in Parallel STREAMS because of the multiprocessor environment
    are also described.  This paper assumes basic knowledge of STREAMS,
    although relevant aspects have been summarized briefly in an overview
    section." 
}

@InProceedings{ibsisvr4,
  author       = "Ian Vessey and Glenn Skinner",
  title        = "Implementing {Berkeley} {Sockets} in {System} {V} {Release} 4",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "177--193",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "sockets, streams, protocol apis",
  abstract     = "A major goal of the UNIX System V, Release 4 (SVR4)
    development effort has been to unify divergent lines of UNIX development
    into a single system offering the best features of its progenitors.  A
    closely related goal has been to augment the programming interface to
    capture applications written for other UNIX variants, by making the
    facilities they depend on available in the unified system.  The socket
    interface is a cornerstone of the 4BSD networking facilities, so its
    presence in SVR4 is an absolute necessity for application capture.  This
    paper describes the design of the SVR4 socket implementation, the
    implementation problems we encountered, and their solutions." 
}

@InProceedings{tnmt,
  author       = "Allan Leinwand and Jeff Okamoto",
  title        = "Two Network Management Tools",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "195--205",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network management, gui"
}

@InProceedings{tcotnnb,
  author       = "Steven~A. Heimlich",
  title        = "Traffic Characterization of the {NSFNET} National Backbone",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "207--227",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network traffic, traffic analysis, packet trains, network
    models, token rings",
  abstract     = {Traditionally, models of packet arrival in communication
    networks have assumed either Poisson or compound Poisson arrival patterns.
    A study of a token ring local area network (LAN) at MIT [5] found that
    packet arrival followed neither of these models.  Instead, traffic followed
    a more general model dubbed the "packet train" which describes network
    traffic as a collection of packet streams traveling between node pairs.  A
    packet train consists of a number of packets traveling between a particular
    node pair.  This study examines the existence of packet trains on NSFNET, a
    high speed national backbone network.  Train characteristics on NSFNET are
    not as striking as those found on the MIT local network; however, certain
    protocols exhibit quite strong train behavior given the great number of
    hosts communicating through the backbone.},
  location     = "https://doi.org/10.1145/98457.98774"
}

@InProceedings{pndavn,
  author       = "Steven~M. Bellovin",
  title        = "Pseudo-Network Drivers and Virtual Networks",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "229--244",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network drivers, tcp/ip, sockets, streams, pseudo-drivers",
  abstract     = "Many operating systems have long had pseudo-teletypes,
    inter-process communication channels that provide terminal semantics on one
    end, and a smart server program on the other.  We describe an analogous
    concept, pseudo-network drivers.  One end of the driver appears to be a
    real network device, with the appropriate interface and semantics; data
    written to it goes to a program, however, rather than to a physical medium.
    Using this and some auxiliary mechanisms, we present a variety of
    applications, including system test, network monitoring, dial-up TCP/IP,
    and ways to both improve and subvert network security.  Most notably, we
    show how pseudo-network devices can be used to create virtual networks and
    to provide encrypted communications capability.  We describe two
    implementations, one using a conventional driver for socket-based systems,
    and one using stream pipes for System V.", 
  location     = "https://www.cs.columbia.edu/~smb/papers/pnet.ext.ps"
}

@InProceedings{sauie,
  author       = "Len Bass and Brian Clapper and Erik Hardy and Rick Kazman and Robert Seacord",
  title        = "Serpent:  {A} User Interface Environment",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "245--258",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "user-interface management systems, separation of concerns",
  abstract     = "Prototyping has been shown to simplify system specification
    and implementation, especially in the area of user interfaces.  Previous
    prototyping approaches do not allow for the evolution of the prototype into
    a production system and do not support maintenance after a system is put
    into use.  A set of goals for a modern user interface environment is
    presented.  Serpent, a prototype implementation which achieves these goals,
    is presented and is shown to have several advantages over other approaches
    to user interface development." 
}

@InProceedings{poouwmams,
  author       = "Masami Hagiya and Kouji Ohtani",
  title        = "Parallel Object-Oriented {UIMS} with Macro and Micro Stubs",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "259--274",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "uims, parallel object-oriented language",
  abstract     = "This paper describes a user-interface management system
    (UIMS) based on a parallel object-oriented model that supports a stub
    generator for connecting the user-interface part of an application running
    in side the UIMS and the application body implementing application-specific
    functions.  The parallel object-oriented model is implemented by a virtual
    machine in the window server, which lets user-interface code run in the
    server.  The UIMS supports two kinds of stub: macro and micro.  With a
    macro stub, an entire Unix process behaves as a parallel object in the UIMS
    parallel object-oriented model, while with a micro stub, each object
    implemented inside a Unix process corresponds to a parallel object in the
    model." 
}

@InProceedings{mastpdropcaw,
  author       = "Stephen~A. Uhler",
  title        = "{\sc Mtx} --- {A} Shell that Permits Dynamic Rearrangement of Process Connections and Windows",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "275--283",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "graphical shell, remote execution, inter-process communication",
  abstract     = "Mtx is a Unix shell, implemented as a single user process,
    with an expanded notion of pipes and i/o redirection.  Mtx supports
    creating and maintaining processes, connecting their inputs and outputs in 
    an arbitrary directed graph.  Each process can have as many windows or
    virtual terminals as required for user interaction.  Through a control
    window Mtx can dynamically manipulate the connections among ongoing
    processes.  In addition, Mtx can rendezvous and connect to Mtx servers on
    remote hosts, conveniently providing pipe connections across a network of
    computer.  This paper describes the use and implementation of Mtx on a
    network of Unix workstations." 
}

@InProceedings{uuaocoaldkfmfs,
  author       = "David Hitz and Guy Harris and James~K. Lau and and Allan~M. Schwartz",
  title        = "Using " # unix # " as One Component of a Lightweight Distributed Kernel for Multiprocessor File Servers",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "285--296",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "coprocessors, light-weight kernels, nfs",
  abstract     = "Auspex builds fast NFS file servers designed to satisfy the
    I/O demands of large networks and high-performance workstations.  The
    architecture handles NFS operations quickly and efficiently by completely
    eliminating Unix from the normal path of NFS service.  We designed a
    message passing kernel that allows a slightly modified Unix kernel to
    execute as a peer processor with Ethernet processors, filesystem
    processors, and disk storage processors.  These non-Unix processors respond
    efficiently to NFS requests and perform IP packet routing.  A separate host
    processor running SunOS4.0 provides full Unix compatibility by servicing
    less time critical and less frequent requests such as Yellow Pages.  Our
    message passing kernel is small (15 kbytes of object) and fast (10,000
    messages per second into a Motorola 68020) and provides source code
    debugging for all processors." 
}

@InProceedings{ahpmbvf,
  author       = "Alan Langerman and Joseph Boykin and Susan LoVerso and Shashi Mangalat",
  title        = "{A} Highly-Parallelized {Mach}-based Vnode Filesystem",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "297--312",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "mach, parallelism, concurrency control, nfs, file systems,
    multiprocessor operating systems, encore computers, performance, portability",
  abstract     = "This paper describes the parallelization of a vnode-based
    filesystem layered on the Mach operating system.  Encore parallelized
    portions of the Mach operating system's 4.3BSD compatibility code to
    increase performance.  Subsequently, Carnegie-Mellon University released a
    version of Mach with substantial modifications to the filesystem to provide
    NSF functionality.  Using the framework left in place from our original
    parallelization effort, we migrated to the new vnode filesystem code by
    modifying our original locking policies to accommodate the new filesystem
    organization.  Based upon performance analysis of our original version, the
    opportunity was also taken to revise the old locking policies to provide
    substantially increased parallelism.  Details of the new locking policies
    and performance analyses are provided.", 
  location     = "ftp://ftp.tuhs.org.ua/Documentation/AUUGN/AUUGN-V10.6.pdf"
}

@InProceedings{pffap,
  author       = "Steven~C. Johnson",
  title        = "Postloading for Fun and Profit",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "325--330",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "system tools, optimization, instrumenting",
  abstract     = "Postload processing, or postloading, is a technique of
    optimizing (or otherwise processing) an executable program after it has
    been linked with ld.  The executable program is read, altered, and
    rewritten with optimizations or other added features.  Postloading, to be
    done reliably, needs changes to the a.out format that increases its size by
    a few percent.  We have found over a dozen significant uses for
    postloading, including optimization, hardware workarounds, profiling and
    execution counting, simulation, 'code critics' (programs that examine, and
    repair, common compiler and assembly code problems), and migration to new
    hardware releases.", 
  location     = "https://www.cs.tufts.edu/comp/150FP/archive/stephen-johnson/postloading.pdf"
}

@InProceedings{dsrms,
  author       = "Margo Seltzer and Peter Chen and John Ousterhout",
  title        = "Disk Scheduling Revisited",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "313--324",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "optimization, disk arm scheduling, storage size, performance",
  abstract     = "Since the invention of the movable head disk, people have
    improved I/O performance by intelligent scheduling of disk accesses.  We
    have applied these techniques to systems with large memories and
    potentially long disk queues.  By viewing the entire buffer cache as a
    write buffer, we can improve disk bandwidth utilization by applying some
    traditional disk scheduling techniques.  We have analyzed these techniques,
    which attempt to optimize head movement and guarantee fairness in response
    time, in the presence of long disk queues.  We then propose two algorithms
    which take rotational latency into account, achieving disk bandwidth
    utilizations of nearly four times a simple first come first serve
    algorithm.  One of these two algorithms, a weighted shortest total time
    first, is particularly applicable to a file server environment because it
    guarantees that all requests get to disk within a specified time window.", 
  location     = "https://web.eecs.umich.edu/~pmchen/papers/seltzer90.pdf"
}

@InProceedings{mssr,
  author       = "Dodi Francisco and Lois~C. Price",
  title        = "Multiple Site Source Reconciliation",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "331--340",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "rcs, software management",
  abstract     = "This paper describes the generic methodology developed at TRW
    Financial Systems to control the integration of source modifications made
    at multiple sites into a single master source which is the basis for a new
    release.  The Multiple Site Source Reconciliation methodology has provided
    confidence that changes made between releases are not lost.  the
    methodology minimizes the manual effort required by configuration
    management engineers and development engineers.  Multiple Site Source
    Reconciliation has successfully supported several large projects." 
}

@InProceedings{aabus,
  author       = "Mitchell Gart",
  title        = "Ada and Binary " # unix # " Standards",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "353--361",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "portability, standards"
}

@InProceedings{cipsd,
  author       = "Brian Berliner",
  title        = "{CVS} {II}:  Parallelizing Software Development",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "341--352",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "source code control, configuration management",
  abstract     = "The program described in this paper fills a need in the UNIX
    community for a freely available tool to manage software revision and
    release control in a multi-developer,multi-directory,multi-group
    environment.  This tool also addresses the increasing need for tracking
    third-party vendor source distributions while trying to maintain local
    modifications to earlier releases."
}

@InProceedings{tptaep,
  author       = "Martha R. Szczur and Karl~R. Wolf",
  title        = "{TAE Plus: Transportable Applications Environment Plus}",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "363--374",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "ui development, portability",
  abstract     = "The Transportable Applications Environment Plus (TAE Plus) is
    a NASA-developed user interface development environment (UIDE) for the
    rapid prototyping, evaluation, implementation, and management of user
    interfaces.  TAE Plus provides an intuitive What You See Is What You Get
    (WYSIWYG) WorkBench for designing an application's user interface.  The
    WorkBench supports the creation and sequencing of displays, including
    real-time, data-driven display objects.  Users can define context-sensitive
    help for a target application.  They can rehearse the user interface and
    also generate code automatically.  In addition TAE Plus contains
    application services for the runtime manipulation and management of the
    user interface.  Based on Motif and the MIT X Window System, TAE Plus runs
    on a variety of Unix- or VMS-based workstations.  TAE Plus is an evolving
    system.  User-defined requirements and new technology guide the development
    of each new version.  Advances in virtual operating systems, human factors,
    computer graphics, command language design, standardization, and software
    portability are monitored and incorporated as they become available." 
}

@Article{msfnwqosg,
  author       = "David K.~Y. Yau and Simon~S. Lam",
  title        = "Migrating Sockets for Network with Quality of Service Guarentees",
  journal      = ton,
  year         = 1998,
  volume       = 6,
  number       = 6,
  pages        = "700--716",
  month        = dec,
  keywords     = "bandwidth scheduling, cpu scheduling, packet demultiplexing,
    quality of service guarantees, user level protocol",
  abstract     = "Migrating Sockets is the protocol processing component of an
    end-system architecture designed for networking with QoS guarantees.  The
    architecture provides: (1) adaptive rate-controlled scheduling of protocol
    threads in Migrating Sockets, (2) rate-based flow control for reserved rate
    connections in future integrated services networks, and (3) a constant
    overhead active demultiplexing mechanism.  Migrating Sockets achieves its
    efficiency by allowing user applications to manage a network endpoint with
    minimal system intervention, providing user level protocols read-only
    access to routing information in a “well-known” shared memory region, and
    integrating efficient kernel level support we previously built.  It is
    backward compatible with Unix semantics and Berkeley sockets, and has been
    used to implement Internet protocols such as TCP, UDP and IP (including IP
    multicast).  We also show that active demultiplexing supported by Migrating
    Sockets can be transparently enabled in wide-area TCP/IP internetworking
    (although it is not restricted to TCP/IP).  We have an implementation of
    Migrating Sockets in Solaris 2.5.  We discuss our implementation
    experience, and present performance results of our system running on the
    Ultra-1, SPARC 10 and SPARC 20 architectures", 
  location     = "https://www.cs.utexas.edu/users/lam/Vita/IEEE/YauLam98.pdf", 
  location     = "https://doi.org/10.1109/90.748083"
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
  journal      = pldi12,
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
  location     = "https://doi.org/10.1145/2254064.2254087",
  location     = "https://cs.nyu.edu/rgrimm/papers/pldi12.pdf"
}

@Article{ptcorcpparfei,
  author       = "Kim, K.~H.",
  title        = "Programmer-Transparent Coordination of Recovering Concurrent Processes:  Philosophy and Rules for Efficient Implementation",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 6,
  pages        = "810--821",
  month        = jun,
  keywords     = "monitors, rollback and recovery, recovery points, error
    recovery, process interaction, programmer-transparent coordination, recovery
    blocks, rollback propagation",
  abstract     = "An approach to coordination of cooperating concurrent
    processes, each capable of error direction and recovery, is presented.
    Error detection, rollback, and retry in a process are specified by a
    well-structured language construct called recovery block.  Recovery points
    of processes must be properly coordinated to prevent a disastrous avalanche
    of process rollbacks.  The approach relies on an intelligent processor
    system (that runs processes) capable of establishing and discarding the
    recovery points of interacting processes in a well coordinated manner such
    that a process never makes two consecutive rollbacks without making a retry
    between the two, and every process rollback becomes a minimum-distance
    rollback.  Following a discussion of the underlying philosophy of the
    author's approach, basic rules of reducing storage and time overhead in
    such a processor system are discussed.  Examples are drawn from the systems
    in which processes communicate through monitors", 
  location     = "https://doi.org/10.1109/32.6160"
}

@Article{aeduai,
  author       = "Dillig, Isil and Dillig, Thomas and Aiken, Alex",
  title        = "Automated Error Diagnosis Using Abductive Inference",
  journal      = pldi12,
  year         = 2012,
  volume       = 47,
  number       = 6,
  pages        = "181--192",
  month        = jun,
  keywords     = "abduction, witnesses, question asking, program proving, error
    classification, proof assistants",
  abstract     = "When program verification tools fail to verify a program,
    either the program is buggy or the report is a false alarm.  In this
    situation, the burden is on the user to manually classify the report, but
    this task is time-consuming, error-prone, and does not utilize facts
    already proven by the analysis.  We present a new technique for assisting
    users in classifying error reports.  Our technique computes small, relevant
    queries presented to a user that capture exactly the information the
    analysis is missing to either discharge or validate the error.  Our insight
    is that identifying these missing facts is an instance of the abductive
    inference problem in logic, and we present a new algorithm for computing
    the smallest and most general abductions in this setting.  We perform the
    first user study to rigorously evaluate the accuracy and effort involved in
    manual classification of error reports.  Our study demonstrates that our
    new technique is very useful for improving both the speed and accuracy of
    error report classification.  Specifically, our approach improves
    classification accuracy from 33% to 90% and reduces the time programmers
    take to classify error reports from approximately 5 minutes to under 1
    minute.", 
  location     = "https://www.cs.utexas.edu/~isil/pldi022-dillig.pdf", 
  location     = "https://doi.org/10.1145/2254064.2254087"
}

@Article{efdmfecfgr,
  author       = "Prem Devanbu and Bill Frakes",
  title        = "Extracting Formal Domain Models from Existing Code for Generative Reuse",
  journal      = "ACM Applied Computing Review",
  year         = 1997,
  volume       = 5,
  number       = 1,
  month        = jun,
  keywords     = "domain models, semantic graphs, reverse engineering, ",
  abstract     = "The existence of a domain model that formally describes the
    meaning of a piece of software can be helpful for re-use.  We illustrate an
    approach, where by reengineering a formal domain model out of an existing
    system, one can generalize the existing system to an application generator:
    we map a domain model for program representations into the front end of a
    compiler, using the Genii system, and use this in Genoa, an application
    generator for language tools.  This approach shows promise in other
    domains, as well.", 
  location     = "http://www.acm.org/sigapp/acr/Issues/V5.1/devanbu.ps"
}

@Article{widdg,
  author       = "David Gardner",
  title        = "What is {DHTML}?",
  journal      = "irt.org",
  year         = 2000,
  month        = jan,
  keywords     = "dhtml, web browsers",
  location     = "https://irt.org/articles/js201/"
}

@Article{oopeia2,
  author       = "S.~Tucker Taft",
  title        = "Object-Oriented Programming Enhancements in {Ada} {200Y}",
  journal      = "Ada User Journal",
  year         = 2003,
  volume       = 24,
  number       = 2,
  pages        = "119--127",
  month        = jun,
  keywords     = "oop languages, cyclic type structures, multiple inheritance,
    type hierarchies, interface inheritance, task types",
  abstract     = "This article provides an overview of four proposed amendments
    to the Ada standard for possible inclusion in the revision planned for late
    2005 or early 2006.  Together, these four amendments can be seen as
    finishing the job of integrating object-oriented programming features into
    Ada.", 
  location     = "http://ada-auth.org/ai-files/grab_bag/oop_200y.pdf"
}

@Article{dqp,
  author       = "Yu, C.~T. and Chang, C.~C.",
  title        = "Distributed Query Processing",
  journal      = surveys,
  year         = 1984,
  volume       = 16,
  number       = 4,
  pages        = "399--433",
  month        = dec,
  keywords     = "communication, cyclic queries, distributed query processing,
    fragment processing, heuristics, join, semijoin, optimization, performance,
    tree queries",
  abstract     = "In this paper, various techniques for optimization queries in
    distributed database are presented.  Although no attempt is made to cover
    all proposed algorithms on this topic, quite a few ideas extracted from
    existing algorithms are outlined.  It is hoped that large-scale experiments
    will be conducted to verify the usefulness of these ideas and that they
    will be integrated to construct a powerful algorithm for distributed query
    processing.", 
  location     = "https://doi.org/10.1145/3872.3874"
}

@Article{cahllfg,
  author       = "Dubach, Christophe and Cheng, Perry and Rabbah, Rodric and Bacon, David~F. and Fink, Stephen~J.",
  title        = "Compiling a High-Level Language for {GPU}s",
  journal      = pldi12,
  year         = 2012,
  volume       = 47,
  number       = 6,
  pages        = "181--192",
  month        = jun,
  keywords     = "java, map, reduce, opencl, kernels, storage management,
    optimizations", 
  abstract     = "Languages such as OpenCL and CUDA offer a standard interface
    for general-purpose programming of GPUs.  However, with these languages,
    programmers must explicitly manage numerous low-level details involving
    communication and synchronization.  This burden makes programming GPUs
    difficult and error-prone, rendering these powerful devices inaccessible to
    most programmers.  We desire a higher-level programming model that makes
    GPUs more accessible while also effectively exploiting their computational
    power.  This paper presents features of Lime, a new Java-compatible
    language targeting heterogeneous systems, that allow an optimizing compiler
    to generate high quality GPU code.  The key insight is that the language
    type system enforces isolation and immutability invariants that allow the
    compiler to optimize for a GPU without heroic compiler analysis.  Our
    compiler attains GPU speedups between 75% and 140% of the performance of
    native OpenCL code.", 
  location     = "https://doi.org/10.1145/2254064.2254066",
  location     = "https://researcher.watson.ibm.com/researcher/files/us-bacon/Dubach12Compiling.pdf"
}

@Article{tdmoi,
  author       = "Anson, Ed",
  title        = "The Device Model of Interaction",
  journal      = "Computer Graphics (" # pot # "Ninth Annual Conference on Computer Graphics and Interactive Techniques)",
  year         = 1982,
  volume       = 16,
  number       = 3,
  pages        = "107--114",
  month        = jul,
  keywords     = "device models, device configuration, user interactions",
  abstract     = "Any interactive system can be described in terms of the
    devices it involves, and their interconnections.  Similarly, each device
    can be described in terms of simpler devices and their interconnections.
    Such descriptions are strictly modular, and well structured.  This
    observation allows any system to be described, at all levels, by the same
    language.  Such descriptions have intuitive appeal for hardware as well as
    software components, and for process control applications as well as
    human-machine interaction.  The Device model of interaction, as described
    here, can ease the job of designing user- friendly interactive systems, and
    can be adapted for automatic compilation.  As an example, the design of an
    actual system component is discussed.  The design is presented, at several
    levels, in a Pascal-like notation.  It represents a module created to
    provide a human-machine interface via a graphic tablet, keyboard and video
    monitor.", 
  location     = "https://doi.org/10.1145/965145.801269"
}

@Article{cbpe,
  author       = "Richard~C. Waters",
  title        = "Clich{\' e}-Based Program Editors",
  journal      = toplas,
  year         = 1994,
  volume       = 16,
  number       = 1,
  pages        = "102--150",
  month        = jan,
  keywords     = "abstract syntax tree, program schemas, computer-aided software
    engineering, plan diagram, reuse, syntax-directed editing, program
      manipulation",
  abstract     = "A cliche-based program editor supports the construction and
    modification of programs in terms of standard algorithmic fragments
    (cliches), as opposed to merely supporting the construction and
    modification of programs in terms of syntactic or textual units.  These
    experimental cliche-based program editors have been implemented, exploring
    the trade-off between power and speed.  The Knowledge-Based Editor in Emacs
    (KBEmacs) is the most powerful of the three editors.  It supports a wide
    range of editing operations and can represent a wide range of cliches
    because it uses an internal representation called plan diagrams, which
    combines features of flowcharts and data flow schemas.  Unfortunately, the
    need to convert back and forth between program text and plan diagrams
    causes KBEmacs to be quite slow.  The Tempest editor uses text as its
    internal representation and is very fast since it does not have to do any
    conversions.  It supports a number of cliche-based operations and can
    represent a variety of cliches.  As a result, Tempest is valuable tool for
    many kinds of editing.  Unfortunately, most programming cliches are too
    complex to be supported directly in terms of program text.  Therefore,
    Tempest has little advantage over standard editors when used for program
    editing.  The Ace editor retains much of the speed of Tempest while
    supporting much of the power of KBEmacs.  Ace is relatively efficient,
    because it uses abstract syntax tree as the internal representation.  It
    achieves high power by basing these abstract syntax trees on a specially
    designed grammar that facilitates the representation and easy combination
    of cliches.  Ace's approach could be used to add powerful and efficient
    cliche-based editing capabilities to any programming environment.  In
    particular, Ace demonstrates that a small change in the internal workings
    of syntax editors is all that is required to open the door to cliche-based
    editing.", 
  location     = "https://doi.org/10.1145/174625.174628",
  location     = "http://www.merl.com/publications/TR91-01"
}

@Article{pioas,
  author       = "Lin, Huimin",
  title        = "Procedural Implementation of Algebraic Specification",
  journal      = toplas,
  year         = 1993,
  volume       = 15,
  number       = 3,
  pages        = "876--895",
  month        = nov,
  keywords     = "abstract implementation, procedural abstraction, program refinement",
  abstract     = "An implementation of an algebraic specification in an
    imperative programming language consists of a representation type, together
    with an invariant and an equivalence relation over it, and a procedure for
    each operator in the specification.  A formal technique is developed to
    check the correctness of an implementation with respect to its
    specification.  Here &ldquo;correctness&rdquo; means that the
    implementation satisfies the axioms and preserves the behavior of the
    specification.  Within legal representing value space, a correct
    implementation behaves like a desirable model of the specification.  A
    notion of implementation refinement is also proposed, and it is shown that
    the correctness relation between implementations and specifications is
    preserved by implementation refinement.  In the extreme case the procedures
    in an implementation may be pre-post-condition pairs.  Such abstract
    implementations can be refined into executable code by refining the
    abstract procedures in it.  In this way a formal link between the algebraic
    and the pre- post-condition specification techniques is established.", 
  location     = "https://doi.org/10.1145/161468.161473"
}

@Article{asolwtpfhsn,
  author       = "Willibald~A. Doeringer and Doug Dykeman and Matthias Kaiserswerth  and Bernard Werner Meister and Harry Rudin and Robin Williamson",
  title        = "{A} Survey of Light-Weight Transport Protocols for High-Speed Networks",
  journal      = "IEEE Transactions on Communications",
  year         = 1990,
  volume       = 38,
  number       = 11,
  pages        = "2025--2039",
  month        = nov,
  keywords     = "light-weight transport protocols, high-speed networks,
    comparative survey, APPN, Datakit, Delta-t, NETBLT, OSI/TP4, TCP, VMTP,
    XTP, end-to-end transmission, connection management, acknowledgements, flow
    control, error handling",
  abstract     = "A comparative survey is presented of techniques used at the
    transport layer in eight representative protocols, most of which were
    designed to improve the protocol processing rate.  The protocols are the
    relevant portions of the APPN, Datakit, Delta-t, NETBLT, OSI/TP4, TCP,
    VMTP, and XTP architectures.  The protocols are described, and the
    functions under consideration are defined.  No distinction is made as to
    whether these functions are carried out in a LAN, MAN, or WAN environment.
    The objective is to provide reliable, end-to-end transmission of data.  The
    mechanisms required to support connection management, acknowledgements,
    flow control, and error handling are examined.  Suitable techniques for
    designing light-weight transport protocols are identified.  A discussion is
    presented as to which technique seems the most promising.", 
  location     = "https://doi.org/10.1109/26.61485"
}

@Article{aooagmae,
  author       = "Fisher, Gene",
  title        = "An Overview of a Graphical Multilanguage Applications Environment",
  journal      = tse,
  year         = 1998,
  volume       = 14,
  number       = 6,
  pages        = "774--786",
  month        = jun,
  keywords     = "graphical programming, dataflow design, multilanguage
    programming, programming environments, user interfaces",
  abstract     = "A programming environment to support the development and use
    of engineering applications is presented.  The environment provides uniform
    support for a set of Pascal-class languages in which engineering and
    scientific applications are commonly written.  The environment includes a
    dynamically multilanguage interpreter debugger to aid in the interactive
    development of applications.  For the application and user, the environment
    provides a graphical program interface based on the concept of a software
    control panel.  Through a control panel, the user may interactively modify
    program parameters and exercise fine-grain control over program execution.
    The environment also includes a graphical design tool for constructing
    executable block diagrams based on standard application programs.  The
    control-panel tool is integrated with the design tool, to provide a uniform
    interface to all levels of program execution.", 
  location     = "https://doi.org/10.1109/32.6157"
}

@Article{aactfaliwm,
  author       = "Robert Cohn and Thomas Gross and Monica Lam and P.~S. Tseng",
  title        = "Architecture and Compiler Tradeoffs for a Long Instruction Word Microprocessor",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "2--14",
  month        = may,
  keywords     = "vliw processors, iwarp, compilation, cpu architecture",
  abstract     = "A very long instruction word (VLIW) processor exploits
    parallelism by controlling multiple operations in a single instruction
    word.  This paper describes the architecture and compiler tradeoffs in the
    design of iWarp, a VLIW single-chip microprocessor developed in a joint
    project with Intel Corp.  The iWarp processor is capable of spec-ifying up
    to nine operations in an instruction word and has a peak performance of 20
    million floating-point op-erations and 20 million integer operations per
    second.  An optimizing compiler has been constructed and used as a tool to
    evaluate the different architectural proposals in the development of iWarp.
    We present here the anal-ysis and compiler optimizations for those
    architectural features that address two key issues in the design of a VLIW
    microprocessor: code density and a streamlined execution cycle.  We support
    the results of our analysis with performance data for the Livermore Loops
    and a selection of programs from the LINPACK library.", 
  location     = "http://www.cs.cmu.edu/afs/cs/user/gyl/afslcc/trg/open/papers/asplos3/mat.ps"
}

@Article{tiifdfha,
  author       = "Sohi, Gurindar~S. and Vajapeyam, Sriram",
  title        = "Tradeoffs in Instruction Format Designs for Horizontal Architectures",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "15--25",
  month        = may,
  keywords     = "vliw architectures, code density, fine-grained parallelism,
    instruction packing, optimization, instruction set design",
  abstract     = "With recent improvements in software techniques and the
    enhanced level of fine grain parallelism made available by such techniques,
    there has been an increased interest in horizontal architectures and large
    instruction words that are capable of issuing more that one operation per
    instruction.  This paper investigates some issues in the design of such
    instruction formats.  We study how the choice of an instruction format is
    influenced by factors such as the degree of pipelining and the
    instruction's view of the register file.  Our results suggest that very
    large instruction words capable of issuing one operation to each functional
    unit resource in a horizontal architecture may be overkill.  Restricted
    instruction formats with limited operation issuing capabilities are capable
    of providing similar performance (measured by the total number of time
    steps) with significantly less hardware in many cases.", 
  location     = "https://doi.org/10.1145/70082.68184"
}

@Article{olsitc5,
  author       = "Dehnert, James~C. and Hsu, Peter Y.-T. and Bratt, Joseph~P.",
  title        = "Overlapped Loop Support in the {Cydra} 5",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "26--38",
  month        = may,
  keywords     = "loop unrolling, vliw architecture, scientific computation,
    data dependencies, instruction scheduling, compilation, loop analysis", 
  abstract     = "The CydraTM 5 architecture adds unique support for
    overlapping successive iterations of a loop to a very long instruction word
    (VLIW) base.  This architecture allows highly parallel loop execution for a
    much larger class of loops than can be vectorized, without requiring the
    unrolling of loops usually used by compilers for VLIW machines.  This paper
    discusses the Cydra 5 loop scheduling model, the special architectural
    features which support it, and the loop compilation techniques used to take
    full advantage of the architecture.", 
  location     = "https://doi.org/10.1145/70082.68185"
}

@Article{asfstc,
  author       = "Burkowski, F.~J. and Cormack, G.~V. and Dueck, G.~D.~P.",
  title        = "Architectural Support for Synchronous Task Communication",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "40--53",
  month        = may,
  keywords     = "ipc, synchronous communication, layered architecture,
    client-server architecture",
  abstract     = "This paper describes the motivation for a set of intertask 
    communication primitives, the hardware support of these primitives, the
    architecture used in the Sylvan project which studies these issues, and the
    experience gained from various experiments conducted in this area.  We
    start by describing how these facilities have been implemented in a
    multiprocessor configuration that utilizes a shared backplane.  This
    configuration represents a single node in the system.  The latter part of
    the paper discusses a distributed multiple node system and the extension of
    the primitives that are used in this expanded environment.", 
  location     = "https://doi.org/10.1145/70082.68186"
}

@Article{tfbamfhssop,
  author       = "Gupta, Rajiv",
  title        = "The Fuzzy Barrier:  {A} Mechanism for High Speed Synchronization of Processors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "54--63",
  month        = may,
  keywords     = "multiprocessor systems, barrier synchronization,
    parallelizing compilers",
  abstract     = "Parallel programs are commonly written using barriers to
    synchronize parallel processes.  Upon reaching a barrier, a processor must
    stall until all participating processors reach the barrier.  A software
    implementation of the barrier mechanism using shared variables has two
    major drawbacks.  Firstly, the execution of the barrier may be slow as it
    may not only require execution of several instructions and but also result
    in hot-spot accesses.  Secondly, processors that are stalled waiting for
    other processors to reach the barrier are essentially idling and cannot do
    any useful work.  In this paper, the notion of the fuzzy barrier is
    presented, that avoids the above drawbacks.  The first problem is avoided
    by implementing the mechanism in hardware.  The second problem is solved by
    extending the barrier concept to include a region of statements that can be
    executed by a processor while it awaits synchronization.  The barrier
    regions are constructed by a compiler and consist of several instructions
    such that a processor is ready to synchronize upon reaching the first
    instruction in this region and must synchronize before exiting the region.
    When synchronization does occur, the processors could be executing at any
    point in their respective barrier regions.  The larger the barrier region,
    the more likely it is that none of the processors will have to stall.
    Preliminary investigations show that barrier regions can be large and the
    use of program transformations can significantly increase their size.
    Examples of situations where such a mechanism can result in improved
    performance are presented.  Results based on a software implementation of
    the fuzzy barrier on the Encore multiprocessor indicate that the
    synchronization overhead can be greatly reduced using the mechanism.", 
  location     = "https://doi.org/10.1145/70082.68187"
}

@Article{asic,
  author       = "Mellor-Crummey, J.~M. and LeBlanc, T.~J.",
  title        = "{A} Software Instruction Counter",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "78--86",
  month        = may,
  keywords     = "parallel program debugging, cfgs, software instrumentation",
  abstract     = "Although several recent papers have proposed architectural
    support for program debugging and profiling, most processors do not yet
    provide even basic facilities, such as an instruction counter.  As a
    result, system developers have been forced to invent software solutions.
    This paper describes our implementation of a software instruction counter
    for program debugging.  We show that an instruction counter can be
    reasonably implemented in software, often with less than 10% execution
    overhead.  Our experience suggests that a hardware instruction counter is
    not necessary for a practical implementation of watch-points and reverse
    execution, however it will make program instrumentation much easier for the
    system developer.", 
  location     = "https://doi.org/10.1145/68182.68189"
}

@Article{espflsccm,
  author       = "Goodman, James~R. and Vernon, Mary~K. and Woest, Philip~J.",
  title        = "Efficient Synchronization Primitives for Large-Scale Cache-Coherent Multiprocessors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "64--75",
  month        = may,
  keywords     = "synchronization, binary semaphores, scheduling, ",
  abstract     = "This paper proposes a set of efficient primitives for process  
    synchronization in multiprocessors.  The only assumptions made in
    developing the set of primitives are that hardware combining is not
    implemented in the inter-connect, and (in one case) that the interconnect
    supports broadcast.  The primitives make use of synchronization bits
    (syncbits) to provide a simple mechanism for mutual exclusion.  The
    proposed implementation of the primitives includes efficient (i.e.  local)
    busy-waiting for syncbits.  In addition, a hardware-supported mechanism for
    maintaining a first-come first-serve queue of requests for a syncbit is
    proposed.  This queueing mechanism allows for a very efficient
    implementation of, as well as fair access to, binary semaphores.  We also
    propose to implement Fetch and Add with combining in software rather than
    hardware.  This allows an architecture to scale to a large number of
    processors while avoiding the cost of hardware combining.  Scenarios for
    common synchronization events such as work queues and barriers are
    presented to demonstrate the generality and ease of use of the proposed
    primitives.  The efficient implementation of the primitives is simpler if
    the multiprocessor has a hardware cache-consistency protocol.  To
    illustrate this point, we outline how the primitives would be implemented
    in the Multicube multiprocessor [GoWo88].", 
  location     = "https://doi.org/10.1145/70082.68188"
}

@Article{edpfm,
  author       = "Aral, Ziya and Gerther, Ilya and Schaffer, Greg",
  title        = "Efficient Debugging Primitives for Multiprocessors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "87--95",
  month        = may,
  keywords     = "parallel debugging, multiprocessor debugging, thread-based
    debugging, dynamic debugging", 
  abstract     = "Existing kernel-level debugging primitives are inappropriate
    for instrumenting complex sequential or parallel programs.  These functions
    incur a heavy overhead in their use of system calls and process switches.
    Context switches are used to alternately invoke the debugger and the target
    programs.  System calls are used to communicate data between the target and
    debugger.  None of this is necessary in shared-memory multiprocessors.
    Multiple processors concurrently run both the debugger and the target.
    Shared-memory is used to implement efficient communication.  The target's
    state is accessed by running both the target and the debugger in the same
    address space.  Finally, instrumentation points, which have largely been
    implemented as traps to the system, are reimplemented as simple branches to
    routines of arbitrary complexity maintained by the debugger.  Not only are
    primitives such as conditional breakpoints thus generalized, but their
    efficiency is improved by several orders of magnitude.  In the process,
    much of the traditional system's kernel support for debugging is
    reimplemented at user-level.  This paper describes the implementation of
    debugging primitives in Parasight, a parallel programming environment.
    Parasight has been used to implement conditional breakpoints, an important
    primitive for both high-level and parallel debugging.  Preliminary
    measurements indicate that Parasight breakpoints are 1000 times faster than
    the breakpoints in parallel &ldquo;cdb&rdquo;, a conventional UNIX
    debugger.  Light-weight conditional breakpoints open up new opportunities
    for debugging and profiling both parallel and sequential programs.", 
  location     = "https://doi.org/10.1145/70082.68190"
}

@Article{smasfssaraps,
  author       = "Staknis, Mark~E.",
  title        = "Sheaved Memory:  Architectural Support for State Saving and Restoration and Paged Systems",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "96--102",
  month        = may,
  keywords     = "memory management, virtual memory, recovery blocks,
    check-pointing, recovery points",
  abstract     = "The concept of read-one/write-many paged memory is introduced
    and given the name sheaved memory.  It is shown that sheaved memory is
    useful for efficiently maintaining checkpoints in main memory and for
    providing state saving and state restoration for software that includes
    recovery blocks or similar control structures.  The organization of sheaved
    memory is described in detail, and a design is presented for a prototype
    sheaved-memory module that can be built easily from inexpensive,
    off-the-shelf components.  The module can be incorporated within many
    available computers without altering the computers' hardware design.  The
    concept of sheaved memory is simple and appealing, and its potential for
    use in a number of software contexts is foreseen.", 
  location     = "https://doi.org/10.1145/70082.68191"
}

@Article{rhpsamdilsra,
  author       = "Holliday, Mark~A.",
  title        = "Reference History, Page Size, and Migration Daemons in Local\slash Remote Architectures",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "104--112",
  month        = may,
  keywords     = "numa machines, storage management, paging management, data
    migration, software address translation", 
  abstract     = "We address the problem of paged main memory management in the
    local/remote architecture subclass of shared memory multiprocessors.  We
    consider the case where the operating system has primary responsibility and
    uses page migration as its main tool.  We identify some of the key issues
    with respect to architectural support (reference history maintenance, and
    page size), and operating system mechanism (duration between daemon passes,
    and number of migration daemons).  The experiments were conducted using
    software implemented page tables on 32-node BBN Butterfly Plus&trade;.
    Several numeral programs with both synthetic and real data were used as the
    workload.  The primary conclusion is that for the cases considered
    migration was at best marginally effective.  On the other hand, practical
    migration mechanisms were robust and never significantly degraded
    performance.  The specific results include: 1) Referenced bits with aging
    can closely approximate Usage fields, 2) larger page sizes are beneficial
    except when the page is large enough to include locality sets of two
    processes, and 3) multiple migration daemons can be useful.  Only small
    regions of the space of architectural, system, and workload parameters were
    explored.  Further investigation of other parameter combinations is clearly
    warranted.", 
  location     = "https://doi.org/10.1145/70082.68192"
}

@Article{auvssfpa,
  author       = "Jouppi, Norman~P. and Bertoni, Jonathan and Wall, David~W.",
  title        = "{A} Unified Vector\slash Scalar Floating-Point Architecture",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "134--143",
  month        = may,
  keywords     = "cpu architecture, vectorization, performance, register files,
    pipelining",
  abstract     = "In this paper we present a unified approach to vector and
    scalar computation, using a single register file for both scalar operands
    and vector elements.  The goal of this architecture is to yield improved
    scalar performance while broadening the range of vectorizable applications.
    For example, reduction operations and recurrences can be expressed in
    vector form in this architecture.  This approach results in greater overall
    performance for most applications than does the approach of emphasizing
    peak vector performance.  The hardware required to support the enhanced
    vector capability is insignificant, but allows the execution of two
    operations per cycle for vectorized code.  Moreover, the size of the
    unified vector/scalar register file required for peak performance is an
    order of magnitude smaller than traditional vector register files, allowing
    efficient on-chip VLSI implementation.  The results of simulations of the
    Livermore Loops and Linpack using this architecture are presented.", 
  location     = "https://doi.org/10.1145/70082.68195", 
  location     = "http://www.hpl.hp.com/techreports/Compaq-DEC/WRL-89-8.html"
}

@Article{fctflda,
  author       = "Gibson, Garth~A. and Hellerstein, Lisa and Karp, Richard~M. and Patterson, David~A.",
  title        = "Failure Correction Techniques for Large Disk Arrays",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "123--132",
  month        = may,
  keywords     = "raid, error coding, parity, linear coding, coding
    performance, data reconstruction, error correcting coding",
  abstract     = "The ever increasing need for I/O bandwidth will be met with
    ever larger arrays of disks.  These arrays require redundancy to protect
    against data loss.  This paper examines alternative choices for encodings,
    or codes, that reliably store information in disk arrays.  Codes are
    selected to maximize mean time to data loss or minimize disks containing
    redundant data, but are all constrained to minimize performance penalties
    associated with updating information or recovering from catastrophic disk
    failures.  We also codes that give highly reliable data storage with low
    redundant data overhead for arrays of 1000 information disks.",
  location     = "https://doi.org/10.1145/70082.68194"
}

@Article{tlbcasa,
  author       = "Black, David~L. and Rashid, Richard~F. and Golub, David~B. and Hill, Charles~R. and Baron, Robert~V.",
  title        = "Translation Lookaside Buffer Consistency:  {A} Software Approach",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "113--122",
  month        = may,
  keywords     = "mach, virtual memory, tlb consistency, consistency protocols,
    performance, software-hardware trade-offs",
  abstract     = "We discuss the translation lookaside buffer (TLB) consistency
    problem for multiprocessors, and introduce the Mach shootdown algorithm for
    maintaining TLB consistency in software.  This algorithm has been
    implemented on several multiprocessors, and is in regular production use.
    Performance evaluations establish the basic costs of the algorithm and show
    that it has minimal impact on application performance.  As a result, TLB
    consistency does not pose an insurmountable obstacle to multiprocessors
    with several hundred processors.  We also discuss hardware support options
    for TLB consistency ranging from a minor interrupt structure modification
    to complete hardware implementations.  Features are identified in current
    hardware that compound the TLB consistency problem; removal or correction
    of these features can simplify and/or reduce the overhead of maintaining
    TLB consistency in software.", 
  location     = "https://doi.org/10.1145/70082.68193", 
  location     = "https://www.cs.rice.edu/~alc/comp521/Papers/p113-black.pdf"
}

@Article{dbrtvcts,
  author       = "Mulder, Hans",
  title        = "Data Buffering:  Run-time versus Compile-time Support",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "144--151",
  month        = may,
  keywords     = "register allocation, cpu architecture, execution performance,
    stack buffers, register set windows",
  abstract     = "Data-dependency, branch, and memory-access penalties are main
    constraints on the performance of high-speed microprocessors.  The
    memory-access penalties concern both penalties imposed by external memory
    (e.g.  cache) or by under utilization of the local processor memory (e.g.
    registers).  This paper focuses solely on methods of increasing the
    utilization of data memory, local to the processor (registers or
    register-oriented buffers).  A utilization increase of local processor
    memory is possible by means of compile-time software, run-time hardware, or
    a combination of both.  This paper looks at data buffers which perform
    solely because of the compile-time software (single register sets); those
    which operate mainly through hardware but with possible software assistance
    (multiple register sets); and those intended to operate transparently with
    main memory implying no software assistance whatsoever (stack buffers).
    This paper shows that hardware buffering schemes cannot replace
    compile-time effort, but at most can reduce the complexity of this effort.
    It shows the utility increase of applying register allocation for multiple
    register sets.  The paper also shows a potential utility decrease inherent
    to stack buffers.  The observation that a single register set, allocated by
    means of interprocedural allocation, performs competitively with both
    multiple register set and stack buffer emphasizes the significance of the
    conclusion", 
  location     = "https://doi.org/10.1145/70082.68196"
}

@Article{artspfat,
  author       = "Roos, Joachim",
  title        = "{A} Real-Time Support Procesor for {Ada} Tasking",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "162--171",
  month        = may,
  keywords     = "ada, tasking, hardware compilation, coprocessors",
  abstract     = "Task synchronization in Ada causes excessive run-time
    overhead due to the complex semantics of the rendezvous.  To demonstrate
    that the speed can be increased by two orders of magnitude by using special
    purpose hardware, a single chip VLSI support processor has been designed.
    By providing predictable and uniformly low overhead for the entire
    semantics of a rendezvous, the powerful real-time constructs of Ada can be
    used freely without performance degradation.  The key to high performance
    is the set of primitive operations implemented in hardware.  Each operation
    is complex enough to replace a considerable amount of code was designed to
    execute with a minimum of communication overhead.  Task control blocks are
    stored on-chip as well as headers for entry, delay and ready queues.  All
    necessary scheduling is integrated in the operations.  Delays are handled
    completely on-chip using an internal real-time clock.  A multilevel design
    strategy, based on silicon compilation, made it possible to run actual Ada
    programs on a functional emulator of the chip and use the results to verify
    the detailed design.  A high degree of parallelism and pipelining together
    with an elaborate internal addressing scheme has reduced the number of
    clock cycles needed to perform each operation.  Using 2 &mgr;m CMOS, the
    processor can run at 20 MHz.  A complex rendezvous, including the calling
    sequence and all necessary scheduling, can be performed in less than 15
    microsecs.", 
  location     = "https://doi.org/10.1145/70082.68198"
}

@Article{aao8isuimdp,
  author       = "Adams, Thomas~L. and Zimmerman, Richard~E.",
  title        = "An Analysis of 8086 Instruction Set Usage in {MS} {DOS} Programs",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "152--161",
  month        = may,
  keywords     = "instruction frequency counts, dynamic program behavior, intel
    processors, dynamic architectural evaluation",
  abstract     = "An architectural evaluation must be based upon real programs
    in an actual operating environment.  The ubiquitous IBM Personal Computer
    running MS DOS represents an excellent test bed for architectural
    evaluation of Intel 8086 systems.  There are many programs and tools
    available to evaluate the performance of IBM Personal Computers and
    compatibles; these evaluation tools are intended to relate the performance
    of one machine to another.  Very little data is available on dynamic
    instruction traces in systems using an 8086.  This paper reports on dynamic
    traces of 8086/88 programs obtained using software tracing tools (described
    below).  The objective of this work is to analyze instruction usage and
    addressing modes used in actual software.  The system used to obtain the
    dynamic instruction frequencies was a compatible running MS DOS 3.1 with a
    Softpatch bios.  To illustrate the RISC argument that only a few
    instruction types are sufficient, the 8086 results are compared with
    similar studies on the Motorola 6800 and Digital Equipment VAX-11.", 
  location     = "https://doi.org/10.1145/70082.68197"
}

@Article{trefsasiot8,
  author       = "Vegdahl, Steven~R. and Pleban, Uwe~F.",
  title        = "The Runtime Environment for {Screme}, a {Scheme} Implementation on the 88000",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "172--182",
  month        = may,
  keywords     = "scheme, runtime environments, tagged data, procedure call and
    return",
  abstract     = "We are implementing a Scheme development system for the
    Motorola 88000. The core of the implementation is an optimizing native code
    compiler, together with a carefully designed runtime system.  This paper
    describes our experiences with the 88000 as a target architecture.  We
    focus on the design decisions concerning the runtime system, particularly
    with respect to data type representations, tag checking, procedure calling
    protocol, generic arithmetic, and the handling of continuations.  We also
    discuss rejected design alternatives, and evaluate the strengths and
    weaknesses of the instruction set with respect to our constraints.", 
  location     = "https://doi.org/10.1145/70082.68199"
}

@Article{pofic,
  author       = "McFarling, Scott",
  title        = "Program Optimization for Instruction Caches",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "183--191",
  month        = may,
  keywords     = "instruction caches, cache hit ratios, code rearrangement,
    performance", 
  abstract     = "This paper presents an optimization algorithm for reducing
    instruction cache misses.  The algorithm uses profile information to
    reposition programs in memory so that a direct-mapped cache behaves much
    like an optimal cache with full associativity and full knowledge of the
    future.  For best results, the cache should have a mechanism for excluding
    certain instructions designated by the compiler.  This paper first presents
    a reduced form of the algorithm.  This form is shown to produce an optimal
    miss rate for programs without conditionals and with a tree call graph,
    assuming basic blocks can be reordered at will.  If conditionals are
    allowed, but there are no loops within conditionals, the algorithm does as
    well as an optimal cache for the worst case execution of the program
    consistent with the profile information.  Next, the algorithm is extended
    with heuristics for general programs.  The effectiveness of these
    heuristics are demonstrated with empirical results for a set of 10 programs
    for various cache sizes.  The improvement depends on cache size.  For a 512
    word cache, miss rates for a direct-mapped instruction cache are halved.
    For an 8K word cache, miss rates fall by over 75%.  Over a wide range of
    cache sizes the algorithm is as effective as increasing the cache size by a
    factor of 3 times.  For 512 words, the algorithm generates only 32% more
    misses than an optimal cache.  Optimized programs on a direct-mapped cache
    have lower miss rates than unoptimized programs on set-associative caches
    of the same size.", 
  location     = "https://doi.org/10.1145/70082.68200"
}

@Article{urtocdcp,
  author       = "Karger, Paul~A.",
  title        = "Using Registers to Optimize Cross-Domain Call Performance",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "194--204",
  month        = may,
  keywords     = "capabilities, cross-domain transfers, performance, register
    set management, compiler optimizations, procedure calls",
  abstract     = "This paper describes a new technique to improve the
    performance of cross-domain calls and returns in a capability-based
    computer system.  Using register optimization information obtained from the
    compiler, a trusted linker can minimize the number of registers that must
    be saved, restored, or cleared when changing from one protection domain to
    another.  The size of the performance gain depends on the level of trust
    between the calling and called protection domains.  The paper presents
    alternate implementations for an extended VAX architecture and for a RISC
    architecture and reports performance measurements done on a
    re-microprogrammed VAX-11/730 processor.", 
  location     = "https://doi.org/10.1145/70082.68201"
}

@Article{tdonanbfhm,
  author       = "Arnould, Emmanuel and Kung, H.~T. and Bitz, Fran{\c c}ois and Sansom, Robert~D. and Cooper, Eric~C. and Peter~A. Steenkiste",
  title        = "The Design of {Nectar}:  {A} Network Backplane for Heterogeneous Multicomputers",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "205--216",
  month        = may,
  keywords     = "network infrastructure, large-grained parallelism,
    communications processors",
  abstract     = "Nectar is a &ldquo;network backplane&rdquo; for use in
    heterogeneous multicomputers.  The initial system consists of a star-shaped
    fiber-optic network with an aggregate bandwidth of 1.6 gigabits/second and
    a switching latency of 700 nanoseconds.  The system can be scaled up by
    connecting hundreds of these networks together.  The Nectar architecture
    provides a flexible way to handle heterogeneity and task-level parallelism.
    A wide variety of machines can be connected as Nectar nodes and the Nectar
    system software allows applications to communicate at a high level.
    Protocol processing is off-loaded to powerful communication processors so
    that nodes do not have to support a suite of network protocols.  We have
    designed and built a prototype Nectar system that has been operational
    since November 1988.  This paper presents the motivation and goals for
    Nectar and describes its hardware and software.  The presentation
    emphasizes how the goals influenced the design decisions and led to the
    novel aspects of Nectar.", 
  location     = "https://doi.org/10.1145/70082.68202"
}

@Article{amdopm,
  author       = "Delgado-Rannauro, Sergio~A. and Reynolds, T.~J.",
  title        = "{A} Message Driven {OR}-Parallel Machine",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "217--228",
  month        = may,
  keywords     = "logic programming, abstract machines, binding environments,
    task scheduling, storage management",
  abstract     = "A message driven architecture for the execution of
    OR-parallel logic languages is proposed.  The computational model is based
    on well known compilation techniques for Logic Languages.  We present first
    the multiple binding mechanism for the OR-parallel Prolog architecture and
    the corresponding OR-parallel abstract machine is described.  A scheduling
    algorithm which does not rely upon the availability of global data
    structures to direct the search for work is discussed.  The message driven
    processor, the processing node of the parallel machine, is designed to
    interact with a shared global address space and to efficiently process
    messages from other processing nodes.  We discuss some of the results
    obtained from a high level functional simulator of the message driven
    machine.", 
  location     = "https://doi.org/10.1145/70082.68203"
}

@Article{etposcc,
  author       = "Owicki, Susan and Agarwal, Anant",
  title        = "Evaluating the Performance of Software Cache Coherence",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "230--242",
  month        = may,
  keywords     = "cache coherence protocols, bus-based architecture,
    interconnection architecture, performance analysis",
  abstract     = "In a shared-memory multiprocessor with private caches, cached
    copies of a data item must be kept consistent.  This is called cache
    coherence.  Both hardware and software coherence schemes have been
    proposed.  Software techniques are attractive because they avoid hardware
    complexity and can be used with any processor-memory interconnection.  This
    paper presents an analytical model of the performance of two software
    coherence schemes and, for comparison, snoopy-cache hardware.  The model is
    validated against address traces from a bus-based multiprocessor.  The
    behavior of the coherence schemes under various workloads is compared, and
    their sensitivity to variations in workload parameters is assessed.  The
    analysis shows that the performance of software schemes is critically
    determined by certain parameters of the workload: the proportion of data
    accesses, the fraction of shared references, and the number of times a
    shared block is accessed before it is purged from the cache.  Snoopy caches
    are more resilient to variations in these parameters.  Thus when evaluating
    a software scheme as a design alternative, it is essential to consider the
    characteristics of the expected workload.  The performance of the two
    software schemes with a multistage interconnection network is also
    evaluated, and it is determined that both scale well.", 
  location     = "https://doi.org/10.1145/70082.68204", 
  location     = "http://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-41.html"
}

@Article{aocipim,
  author       = "Weber, Wolf-Dietrich and Gupta, Anoop",
  title        = "Analysis of Cache Invalidation Patterns in Multiprocessors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "243--256",
  month        = may,
  keywords     = "multiprocessor programs, program traces, trace analysis, data
    access patterns, cache invalidation, cache directories",
  abstract     = "To make shared-memory multiprocessors scalable, researchers
    are now exploring cache coherence protocols that do not rely on broadcast,
    but instead send invalidation messages to individual caches that contain
    stale data.  The feasibility of such directory-based protocols is highly
    sensitive to the cache invalidation patterns that parallel programs
    exhibit.  In this paper, we analyze the cache invalidation patterns caused
    by several parallel applications and investigate the effect of these
    patterns on a directory-based protocol.  Our results are based on
    multiprocessor traces with 4, 8 and 16 processors.  To gain insight into
    what the invalidation patterns would look like beyond 16 processors, we
    propose a classification scheme for data objects found in parallel
    applications and link the invalidation traffic patterns observed in the
    traces back to these high-level objects.  Our results show that
    synchronization objects have very different invalidation patterns from
    those of other data objects.  A write reference to a synchronization object
    usually causes invalidations in many more caches.  We point out situations
    where restructuring the application seems appropriate to reduce the
    invalidation traffic, and others where hardware support is more
    appropriate.  Our results also show that it should be possible to scale
    well-written parallel programs to a large number of processors without an
    explosion in invalidation traffic.", 
  location     = "https://doi.org/10.1145/70082.68205"
}

@Article{teosotcabpopp,
  author       = "Eggers, Susan~J. and Katz, Randy~H.",
  title        = "The Effect of Sharing on the Cache and Bus Performance of Parallel Programs",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "257--370",
  month        = may,
  keywords     = "multiprocessor caches, cache invalidation, cache performance,
    parallel performance, write invalidation, storage access patterns, cache
    parameters",
  abstract     = "Bus bandwidth ultimately limits the performance, and
    therefore the scale, of bus-based, shared memory multiprocessors.  Previous
    studies have extrapolated from uniprocessor measurements and simulations to
    estimate the performance of these machines.  In this study, we use traces
    of parallel programs to evaluate the cache and bus performance of shared
    memory multiprocessors, in which coherency is maintained by a
    write-invalidate protocol.  In particular, we analyze the effect of sharing
    overhead on cache miss ratio and bus utilization.  Our studies show that
    parallel programs incur substantially higher miss ratios and bus
    utilization than comparable uniprocessor programs.  The sharing component
    of these metrics proportionally increases with both cache and block size,
    and for some cache configurations determines both their magnitude and
    trend.  The amount of overhead depends on the memory reference pattern to
    the shared data.  Programs that exhibit good per-processor-locality perform
    better than those with fine-grain-sharing.  This suggests that parallel
    software writers and better compiler technology can improve program
    performance through better memory organization of shared data.", 
  location     = "https://doi.org/10.1145/70082.68206", 
  location     = "http://www2.eecs.berkeley.edu/Pubs/TechRpts/1988/CSD-88-475.pdf"
}

@Article{moofpo,
  author       = "Dally, William~J.",
  title        = "Micro-Optimization of Floating-Point Operations",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "283--289",
  month        = may,
  keywords     = "floating-point operations, microFPUs, compiler optimizations",
  abstract     = "This paper describes micro-optimization, a technique for
    reducing the operation count and time required to perform floating-point
    calculations.  Micro-optimization involves breaking floating-point
    operations into their constituent micro-operations and optimizing the
    resulting code.  Exposing micro-operations to the compiler creates many
    opportunities for optimization.  Redundant normalization operations can be
    eliminated or combined.  Also, scheduling micro-operations separately
    allows dependent operations to be partially overlapped.  A prototype
    expression compiler has been written to evaluate a number of
    micro-optimizations.  On a set of benchmark expressions operation count is
    reduced by 33% and execution time is reduced by 40%.", 
  location     = "https://doi.org/10.1145/70082.68208"
}

@Article{ailpfsasm,
  author       = "Jouppi, Norman~P. and Wall, David~W.",
  title        = "Available Instruction-Level Parallelism for Superscalar and Superpipelined Machines",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "272--282",
  month        = may,
  keywords     = "parallelism, pipelining, super-scalar issue",
  abstract     = "Superscalar machines can issue several instructions per
    cycle. Superpipelined machines can issue only one instruction per cycle,
    but they have cycle times shorter than the latency of any functional unit.
    In this paper these two techniques are shown to be roughly equivalent ways
    of exploiting instruction-level parallelism.  A parameterizable code
    reorganization and simulation system was developed and used to measure
    instruction-level parallelism for a series of benchmarks.  Results of these
    simulations in the presence of various compiler optimizations are
    presented.  The average degree of superpipelining metric is introduced.
    Our simulations suggest that this metric is already high for many machines.
    These machines already exploit all of the instruction-level parallelism
    available in many non-numeric applications, even without parallel
    instruction issue or higher degrees of pipelining.", 
  location     = "https://doi.org/10.1145/70082.68207"
}

@Article{lomii,
  author       = "Smith, Michael~D. and Johnson, Mike and Horowitz, Mark~A.",
  title        = "Limits on Multiple Instruction Issue",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "290--302",
  month        = may,
  keywords     = "superscalar issue, architecture simulation, instruction-level
    concurrency",
  abstract     = "This paper investigates the limitations on designing a
    processor which can sustain an execution rate of greater than one
    instruction per cycle on highly-optimized, non-scientific applications.  We
    have used trace-driven simulations to determine that these applications
    contain enough instruction independence to sustain an instruction rate of
    about two instructions per cycle.  In a straightforward implementation,
    cost considerations argue strongly against decoding more than two
    instructions in one cycle.  Given this constraint, the efficiency in
    instruction fetching rather than the complexity of the execution hardware
    limits the concurrency attainable at the instruction level.", 
  location     = "https://doi.org/10.1145/70082.68209"
}

@Article{otdooss,
  author       = "Lauer, Hugh~C. and Needham, Roger~M.",
  title        = "On the Duality of Operating System Structures",
  journal      = osr,
  year         = 1979,
  volume       = 13,
  number       = 2,
  pages        = "3--19",
  month        = apr,
  keywords     = "message passing, single-thread procedures, duality, operating
    system structure",
  abstract     = "Many operating system designs can be placed into one of two
    very rough categories, depending upon how they implement and use the
    notions of process and synchronization.  One category, the Message-oriented
    System, is characterized by a relatively small, static number of processes
    with an explicit message system for communicating among them.  The other
    category, the Procedure-oriented System, is characterized by a large,
    rapidly changing number of small processes and a process synchronization
    mechanism based on shared data.  In this paper, it is demonstrated that these
    two categories are duals of each other and that a system which is
    constructed according to one model has a direct counterpart in the other.
    The principal conclusion is that neither model is inherently preferable,
    and the main consideration for choosing between them is the nature of the
    machine architecture upon which the system is being built, not the
    application which the system will ultimately support.", 
  location     = "https://doi.org/10.1145/850657.850658"
}

@Article{aoefbpps,
  author       = "Bershad, Brian~N. and Lazowska, Edward~D. and Levy, Henry~M. and Wagner, David~B.",
  title        = "An Open Environment for Building Parallel Programming Systems",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "1--9",
  month        = sep,
  keywords     = "object-oriented design, parallel programming, open systems,
    component customization, presto, synapse",
  abstract     = "PRESTO is a set of tools for building parallel programming
    systems on shared-memory multiprocessors.  PRESTO's goal is to provide a
    framework within which one can easily build efficient support for any of a
    wide variety of &ldquo;models&rdquo; of parallel programming.  PRESTO is
    designed for easy modification and extension, not only at the level of the
    primitives and structures made available for the application programmer's
    use, but also at the level of the run-time kernel that supports parallel
    applications.  PRESTO is implemented in the object-oriented language C++ on
    a Sequent Balance 21000 and has been used in a number of applications that
    are described in this paper.", 
  location     = "https://homes.cs.washington.edu/~bershad/Papers/p1-bershad.pdf"
}

@Article{ewpdn,
  author       = "Notkin, David and Snyder, Lawrence and Socha, David and Bailey, Mary~L. and Forstall, Bruce and Gates, Kevin and Greenlaw, Ray and Griswold, Willian~G. and Holman, Thomas~J. and Korry, Richard and Lasswell, Gemini and Mitchell, Robert and Nelson, Philip~A.",
  title        = "Experiences with {Poker}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "10--20",
  month        = sep,
  keywords     = "parallel programming, graphical programming environments,
    graphical programming languages, portability",
  abstract     = "Experience from over five years of building nonshared memory
    parallel programs using the Poker Parallel Programming Environment has
    positioned us to evaluate our approach to defining and developing parallel
    programs.  This paper presents the more significant results of our
    evaluation of Poker.  The evaluation is driving our next effort in parallel
    programming environment; many of the results should be sufficiently general
    to apply to other related efforts.", 
  location     = "https://doi.org/10.1145/62115.62118"
}

@Article{niaipip,
  author       = "Aral, Ziya and Gertner, Ilya",
  title        = "Non-Intrusive and Interactive Profiling in {Parasight}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "21--30",
  month        = sep,
  keywords     = "parallel programming, debugging, profiling, single-address spaces",
  abstract     = "Debugging the performance of parallel applications is crucial
    for fully utilizing the potential of multiprocessor hardware.  This paper
    describes profiling tools in Parasight, a programming environment that is
    geared towards non-intrusive performance analysis and high-level debugging.
    In Parasight, profilers execute as observer programs which run concurrently
    with the target program and monitor its behavior.  This design grew out of
    our experience in debugging and monitoring the performance of real parallel
    programs.  Parasight is used to implement an interactive profiler based on
    gprof, a standard UNIX profiling tool.  The new profiler is an interactive
    tool that is dynamically controlled by the programmer and can run
    concurrently with the target program.  It is also less intrusive than the
    original.  This was achieved in part by off-loading the profile gathering
    computations to an adjacent processor and in part by allowing selective
    profiling.  In conjunction with the new profiler, Parasight is used to
    implement high-level custom profiling routines that may be inserted at
    arbitrary locations in a target program to measure user-defined
    abstractions.  One outcome has been to develop the beginnings of a
    profiling methodology in which high-level performance problems are detected
    through a function profiler and detailed performance bottlenecks are
    analyzed with custom profiling routines.  Parasight, the new profiler and
    their associated tools have been implemented on the Encore Multimax, a
    shared-memory multiprocessor running UNIX.  They have been used to profile
    both parallel and sequential programs.", 
  location     = "https://doi.org/10.1145/62115.62119"
}

@Article{pdfasa,
  author       = "Bernd Bruegge",
  title        = "Program Development for a Systolic Array",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "31--41",
  month        = sep,
  keywords     = "program-development environments, systolic arrays,
    co-processing, parallel programming, warp",
  abstract     = "The primary objective of the Warp programming environment
    (WPE) is to simplify the use of Warp, a high-performance programmable
    linear systolic array connected to a general-purpose workstation host.  WPE
    permits the development of distributed applications that access Warp either
    locally from the host or remotely from a large number of workstations
    connected to a local area network.  Its audience includes the user who
    calls routines from a library, the programmer who develops new algorithms
    for Warp, as well as the implementor who writes support software.  Since
    the linear arrangement of the cells in the array restricts direct input and
    output with the host to the boundary cells, a source language debugger is
    important for program development on Warp.  This paper presents the Warp
    debugger and its relation to the other components of the Warp programming
    environment.", 
  location     = "https://doi.org/10.1145/62115.62120", 
  location     = "http://reports-archive.adm.cs.cmu.edu/anon/1994/CMU-CS-94-180.ps"
}

@Article{cf8afftcmcs,
  author       = "Albert, Eugene and Knobe, Kathleen and Lukas, Joan~D. and {Steele Jr.}, Guy~L.",
  title        = "Compiling {Fortran} 8x Array Features for the {Connection Machine} Computer System",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "42--56",
  month        = sep,
  keywords     = "simd computing, parallel compilation, matrix computations,
    connection machine, hypercube networks, optimizations",
  abstract     = "The Connection Machine&reg; computer system supports a data
    parallel programming style, making it a natural target architecture for
    Fortran 8x array constructs.  The Connection Machine Fortran compiler
    generates VAX code that performs scalar operations and directs the
    Connection Machine to perform array operations.  The Connection Machine
    virtual processor mechanism supports elemental operations on very large
    arrays.  Most array operators and intrinsic functions map into single
    instructions or short instruction sequences.  Noncontiguous array sections,
    array-valued subscripts, and parallel constructs such as WHERE and FORALL
    are also readily accommodated on the Connection Machine.  In addition to
    such customary optimizations as common subexpression elimination, the CM
    Fortran compiler minimizes data motion for aligning array operations,
    minimizes transfers between the Connection Machine and the VAX and
    minimizes context switching for masked computations.", 
  location     = "https://doi.org/10.1145/62115.62121"
}

@Article{ccpfahm,
  author       = "Quinn, Michael~J. and Hatcher, Philip~J. and Jourdenais, Karen~C.",
  title        = "Compiling {C}* Programs for a Hypercube Multicomputer",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "57--65",
  month        = sep,
  keywords     = "hypercube interconnects, parallel compilation, message passing",
  abstract     = "A data parallel language such as C* has a number of
    advantages over conventional hypercube programming languages.  The
    algorithm design process is simpler, because (1) message passing is
    invisible, (2) race conditions are nonexistent, and (3) the data can be put
    into a one-to-one correspondence with the virtual processors.  Since data
    are mapped to virtual processors, rather than physical processors, it is
    easier to move algorithms implemented on one size hypercube to a larger or
    smaller system.  We outline the design of a C* compiler for a hypercube
    multicomputer.  Our design goals are to minimize the amount of time spent
    synchronizing, limit the number of interprocessor communications, and make
    each physical processor's emulation of a set of virtual processors as
    efficient as possible.  We have hand translated three benchmark programs
    and compared their performance with that of ordinary C programs.  All three
    programs -- matrix multiplication, LU decomposition, and hyperquicksort -- 
    achieve reasonable speedup on a commercial hypercube, even when solving
    problems of modest size.  On a 64-processor NCUBE/7, the C* matrix
    multiplication program achieves a speedup of 27 when multiplying two 64
    &times; 64 matrices, the hyperquicksort program achieves a speedup of 10
    when sorting 16,384 integers, and LU decomposition attains a speedup of 7
    when decomposing a 256 &times; 256 system of linear equations.  We believe
    the degradation in machine performance resulting from the use of a data
    parallel language will be more than compensated for by the increase in
    programmer productivity.",
  location     = "https://doi.org/10.1145/62115.62122"
}

@Article{pdesofsqn,
  author       = "David~M. Nicol",
  title        = "Parallel Discrete-Event Simulation Of {FCFS} Stochastic Queueing Networks",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "124--137",
  month        = sep,
  keywords     = "discrete event simulation, parallel evaluation, lookahead,
    performance, network simulation ",
  abstract     = "Physical systems are inherently parallel; intuition suggests
    that simulations of these systems may be amenable to parallel execution.
    The parallel execution of a discrete-event simulation requires careful
    synchronization of processes in order to ensure the execution's
    correctness; this synchronization can degrade performance.  Largely
    negative results were recently reported in a study which used a well-known
    synchronization method on queueing network simulations.  In this paper we
    discuss a synchronization method, appointments, which has proven itself to
    be effective on simulations of FCFS queueing networks.  The key concept
    behind appointments is the provision of lookahead.  Lookahead is a
    prediction on a processor's future behavior, based on an analysis of the
    processor's simulation state.  We show how lookahead can be computed for
    FCFS queueing network simulations, give performance data that demonstrates
    the method's effectiveness under moderate to heavy loads, and discuss
    performance trade-offs between the quality of lookahead, and the cost of
    computing lookahead.", 
  location     = "https://doi.org/10.1145/62115.62128"
}

@Article{qeand,
  author       = "Goldman, Ron and Gabriel, Richard~P.",
  title        = "Qlisp:  Experience and New Directions",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "111--123",
  month        = sep,
  keywords     = "common lisp, parallel lisp, futures, parallel programming",
  abstract     = "Qlisp, a dialect of Common Lisp, has been proposed as a 
    multiprocessing programming language which is suitable for studying the
    styles of parallel programming at the medium-grain level.  An initial
    version of Qlisp has been implemented on a multiprocessor and a number of
    experiments with it conducted.  This paper describes the implementation,
    reports on some of the experiments, and presents some new constructs that
    are suggested from programming experience with Qlisp.", 
  location     = "https://doi.org/10.1145/62116.62127"
}

@Article{rlpfce,
  author       = "Larus, James~R. and Hilfinger, Paul~N.",
  title        = "Restructuring {Lisp} Programs for Concurrent Execution",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "100--110",
  month        = sep,
  keywords     = "lisp, program analysis, parallelization, program dependency
    graph, aliases, program transformations, synchronization",
  abstract     = "This paper describes the techniques that the program
    transformation system CURARE uses to restructure Lisp programs for
    concurrent execution in multiprocessor Lisp systems and discusses the
    problems inherent in producing concurrent programs in a flexible and
    dynamic programming language such as Lisp.  CURARE's overall organization
    is similar to other program restructuring systems: it detects potential
    conflicts between statements in a program, then transforms the program to
    improve its concurrent performance, and finally inserts synchronization to
    ensure the program's concurrent behavior.  However, the language and
    programs that CURARE transforms are very different from the FORTRAN
    programs that are the traditional targets of program restructuring and so
    CURARE requires new algorithms and approaches, which are described in this
    paper.",
  location     = "https://doi.org/10.1145/62115.62126"
}

@Article{eiafpaar,
  author       = "Li, Zhiyuan and Yew, Pen-Chung",
  title        = "Efficient Interproedural Analysis for Program AParallelization and Restructuring",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "85--99",
  month        = sep,
  keywords     = "loop parallelization, subscript propagation, interprocedural
    analysis, program transformations",
  abstract     = "An approach to efficient interprocedural analysis for program
    parallelization and restructuring is presented.  Such analysis is needed
    for parallelizing loops which contain procedure calls.  Our approach
    captures call effect on data dependencies by propagating the precise
    information of array subscripts from the called procedure.  This allows the
    optimizing compiler to choose an efficient yet precise data dependence test
    scheme depending on the complexity of array reference patterns.  The other
    existing methods do not provide such flexibility, hence may suffer from
    either imprecision or inefficiency.  The paper also discusses usage of
    classical summary information in several important transformations for
    program parallelization.  Experimental results are reported.", 
  location     = "https://doi.org/10.1145/62115.62125"
}

@Article{udptiapa,
  author       = "Howard~P. Katseff",
  title        = "Using Data Partitioning to Implement a Parallel Assembler",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "66--76",
  month        = sep,
  keywords     = "parallel assembly, symbol relocation",
  abstract     = "A technique for implementing algorithms on a multiprocessor
    computer system is data partitioning, in which input data for a problem is
    partitioned among many processors that cooperate to solve the problem.
    This paper demonstrates that data partitioning is a good method for
    implementing an assembler on a message-passing multiprocessor system: it
    yields a speedup exceeding a factor of 6 with eight processors.  We compare
    several alternative methods for distributing program text and sharing
    global information among the processors executing the assembler: operations
    that are important for a variety of applications implemented with data
    partitioning.", 
  location     = "https://doi.org/10.1145/62115.62123"
}

@Article{adopataae,
  author       = "Burke, Michael and Cytron, Ron and Ferrante, Jeanne and Hsieh, Wilson and Sarkar, Vivek and Shields, David",
  title        = "Automatic Discovery of Parallelism:  {A} Tool and an Experiment",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "77--84",
  month        = sep,
  keywords     = "control flow analysis, data flow analysis, control dependency
    analysis, ",
  abstract     = "This paper reports preliminary results from applying advanced
    techniques to the parallelization of sequential programs.  Such techniques
    include interprocedural analysis and the identification of nested
    parallelism.  These techniques have been proposed for exploiting the
    greater concurrency offered by multiprocessors as compared with vector
    architectures.  The effectiveness of these techniques as applied to some
    popular numerical Fortran programs is examined.  Although extrapolation is
    difficult, these preliminary results are encouraging indicators of the
    success of these techniques.", 
  location     = "https://doi.org/10.1145/62115.62124"
}

@Article{speimpialps,
  author       = "Tambe, Milind and Kalp, Dirk and Gupta, Anoop and Forgy, Charles~L. and Milnes, Brian~G. and Newell, Allen",
  title        = "Soar/{PSM-E}:  Investigating Match Parallelism in a Learning Production System",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "146--160",
  month        = sep,
  keywords     = "production systems, parallel execution",
  abstract     = "Soar is an attempt to realize a set of hypotheses on the
    nature of general intelligence within a single system.  Soar uses a
    production system (rule based system) to encode its knowledge base.  Its
    learning mechanism, chunking, adds productions continuously to the
    production system.  The process of searching for relevant knowledge,
    matching, is known to be a performance bottleneck in production systems.
    PSM-E is a C-based implementation of the OPS5 production system on the
    Encore Multimax that has achieved significant speedups in matching.  In
    this paper we describe our implementation, Soar/PSM-E, of Soar on the
    Encore Multimax that is built on top of PSM-E.  We first describe the
    extensions and modifications required to PSM-E in order to support Soar,
    especially the capability of adding productions at run time as required by
    chunking.  We present the speedups obtained on Soar/PSM-E and discuss some
    effects of chunking on parallelism.  We also analyze the performance of the
    system and identify the bottlenecks limiting parallelism.  Finally, we
    discuss the work in progress to deal with some of them.", 
  location     = "https://doi.org/10.1145/62115.62130"
}

@Article{tpdaioaicgr,
  author       = "Rose, Jonathan",
  title        = "The Parallel Decomposition and Implementation of an Integrated Circuit Global Router",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "138--145",
  month        = sep,
  keywords     = "circuit routing, parallel execution",
  abstract     = "Better quality automatic layout of integrated circuits can be
    obtained by combining the placement and routing phases so that routing is
    used as the cost function for placement optimization.  Conventional routers
    are too slow to make this feasible, and so this paper presents a parallel
    decomposition and implementation of an integrated circuit global router.
    The LocusRoute router is divided into three orthogonal &ldquo;axes&rdquo;
    of parallelism: routing several wires at once, routing segments of a wire
    in parallel, and dividing up the potential routes of a segment among
    different processors to be evaluated.  The implementation of two of these
    approaches achieve significant speedup - wire-by-wire parallelism attains
    speedups from 6.9 to 13.6 using sixteen processors, and route-by-route
    achieves up to 4.6 using eight processors.  When combined, these approaches
    can potentially provide speedups of as much as 55 times.", 
  location     = "https://doi.org/10.1145/62115.62129"
}

@Article{lsppewtbbpp,
  author       = "Thomas~J. LeBlanc and Michael~L. Scott and Christopher~M. Brown",
  title        = "Large-Scale Parallel Programming:  Experience with the {BBN Butterfly Parallel Processor}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "161--172",
  month        = sep,
  keywords     = "multiprocessor, numa processor, butterfly switch, software
    tools, software libraries, programming abstractions, parallel programming,
    software development",
  abstract     = "For three years, members of the Computer Science Department
    at the University of Rochester have used a collection of BBN
    Butterfly&trade; Parallel Processors to conduct research in parallel
    systems and applications.  For most of that time, Rochester's 128-node
    machine has had the distinction of being the largest shared-memory
    multiprocessor in the world.  In the course of our work with the Butterfly
    we have ported three compilers, developed five major and several minor
    library packages, built two different operating systems, and implemented
    dozens of applications.  Our experience clearly demonstrates the
    practicality of large-scale shared-memory multiprocessors, with non-uniform
    memory access times.  It also demonstrates that the problems inherent in
    programming such machines are far from adequately solved.  Both locality
    and Amdahl's law become increasingly important with a very large number of
    nodes.  The availability of multiple programming models is also a concern;
    truly general-purpose parallel computing will require the development of
    environments that allow programs written under different models to coexist
    and interact.  Most important, there is a continuing need for high-quality
    programming tools; widespread acceptance of parallel machines will require
    the development of programming environments comparable to those available
    on sequential computers.", 
  location     = "https://doi.org/10.1145/62115.62131",
  location     = "https://www.cs.rochester.edu/u/scott/papers/1988_BPR22.pdf"
}

@Article{citlaf,
  author       = "Lee Anne Fennell",
  title        = "Common Intrest Tragedies",
  journal      = "Northwestern University Law Review",
  year         = 2004,
  volume       = 98,
  pages        = "907",
  keywords     = "commons tragedies, anticommons tragedies, prisoners' dilemma,
    chicken game",
  abstract     = "This paper engages one of the fastest-growing topics in
    property theory, the anticommons.  The anticommons idea originated in Frank
    Michelman's description of a regulatory regime in which nobody could use a
    particular resource without the permission of everyone else.  Michael
    Heller's subsequent construction of a category of anticommons property
    corresponding to recognizable resource problems sparked a surge of
    scholarly interest in the notion.  The anticommons template has now been
    applied in many property contexts, from patents to land use.  However, some
    of the key criteria scholars have offered for identifying an anticommons
    and distinguishing it from an ordinary commons collapse upon scrutiny.  The
    fragility of the existing boundaries between commons and anticommons
    suggests a larger question that takes center stage here: How might the
    universe of common and interdependent resource problems be most usefully
    carved up? In addressing that question, the paper makes three
    contributions.  First, it develops a functional taxonomy for categorizing
    common interest tragedies.  This taxonomy breaks tragedies into categories
    at the macro level based on the pattern of strategic interaction they
    embody, and further differentiates among tragedies at the micro level based
    on the shape of the production function for the resulting surplus or
    deficit.  Second, the paper explores underappreciated connections between
    types of resource-related dilemmas, and highlights the choices that often
    must be made between two potential tragedies in complex, interdependent
    settings.  Third, the paper shows how the taxonomy developed here offers
    access to analytic tools for making such choices.  The approach taken here
    is therefore designed to provide greater analytical traction on resource
    allocation problems, as well as to advance dialogue in this area of
    property theory.", 
  location     = "https://chicagounbound.uchicago.edu/cgi/viewcontent.cgi?article=8861&context=journal_articles"
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

@Book{inff,
  author       = "Florian Freistetter",
  title        = "Isaac Newton",
  subtitle     = "The Asshole Who Reinvented the Universe",
  publisher    = "Prometheus Books",
  year         = 2018,
  address      = "Amherst, " # NY,
  keywords     = "isaac newton, royal society, calculus, optics, astronomy,
    libnetz, hooke, personality, scientific practice",
  location     = "QC 16.N7 F7413 2018"
}

@Book{tlm2014,
  author       = "Lauren Myracle",
  title        = "ttyl",
  publisher    = "Amulet Books",
  year         = 2014,
  address      = nyny,
  keywords     = "high school, sophomores, texting",
  location     = "PZ 7.M9955 Tt"
}

@Book{emjaj,
  author       = "Jennifer~A. Jordan",
  title        = "Edible Memory",
  subtitle     = "The Lure of Heirloom Tomatoes \& Other Forgotten Foods",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "heirloom varieties, vegetables, fruits",
  location     = "SB 453.5.J67"
}

@Book{digmp,
  author       = "Mark Pilgrim",
  title        = "Dive into Greasemonkey",
  publisher    = "Lulu",
  year         = 2005,
  keywords     = "web development, web browsers, javascript",
  location     = "http://www.lulu.com/shop/mark-pilgrim/dive-into-greasemonkey/paperback/product-228158.html"
}

@Book{wtay,
  author       = "Preti Taneja",
  title        = "We That Are Young",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "business, family, murder, india",
  location     = "PR 6120.A465 W47"
}

@Book{wsnifa,
  author       = "Ian~F. Akyildiz and Mehmet Can Vuran",
  title        = "Wireless Sensor Networks",
  publisher    = "Wiley",
  year         = 2010,
  address      = "West Sussex, U.K.",
  keywords     = "applications, design, physical layer, mac layer, error
    control, network layer, transport layer, application layer, cross-layer
    solutions, time synchronization, localization, topology management, actor
    networks, wireless multimedia sensor networks, wireless underwater sensor
    networks, wireless underground sensor networks, grand challenges",
  location     = "TK 7872.D48 A38"
}

@Book{ccnbr,
  author       = "Nayan~B. Ruparelia",
  title        = "Cloud Computing",
  publisher    = mitp,
  year         = 2016,
  address      = cma,
  keywords     = "cloud computing, value models, use cases, cloud transitions,
    iaas, paas, saas, inaas, bpaas",
  location     = "QA 76.585 R87"
}

@Book{cn5jfk,
  author       = "James.~F. Kurose and Keith~W. Ross",
  title        = "Computer Networking",
  subtitle     = "A Top-Down Approach",
  publisher    = aw,
  year         = 2010,
  address      = nyny,
  edition      = "fifth",
  keywords     = "computer networks, internet, osi network stack. wireless
    networks, mobile networks, multimedia networking, security, network
    management", 
  location     = "TK 5105.875 I57 K88"
}

@Book{isewtyt,
  author       = "David Cay Johnston",
  title        = "It's Even Worse Than You Think",
  subtitle     = "What the Trump Administration Is Doing to America",
  publisher    = "Simon \& Schuster",
  year         = 2018,
  address      = nyny,
  keywords     = "donald trump, corruption, deceit, failure",
  location     = "E 912.J64 2018"
}

@Book{dspsuj,
  author       = "Mark Allen Weiss",
  title        = "Data Structures \& Problem Solving Using Java",
  publisher    = "Addison-Wesley",
  year         = 2010,
  address      = nyny,
  keywords     = "java",
  location     = "QA 76.73.J38 W45"
}

@Book{tpmlw,
  author       = "Liz Williams",
  title        = "The Poision Master",
  publisher    = "Bantam",
  year         = 2003,
  address      = nyny,
  keywords     = "assassination",
  location     = "https://lccn.loc.gov/2003577136"
}

@Book{ohtwbi,
  author       = "Anthony Powell",
  title        = "{O}, How the Wheel Becomes It!",
  publisher    = ucp,
  year         = 1983,
  address      = chil,
  keywords     = "the past, lit'rary life, publishing, media",
  location     = "PR 6031.O74 O2"
}

@Book{gsbhw,
  author       = "Ben~H. Winters",
  title        = "Golden State",
  publisher    = "Mulholland Books",
  year         = 2019,
  address      = nyny,
  keywords     = "the truth, surveillance, who dunnit?",
  location     = "https://lccn.loc.gov/2018941036"
}

@Book{hotf,
  author       = "H.~W. Brands",
  title        = "Heirs of the Founders",
  publisher    = "Doubleday",
  year         = 2018,
  address      = nyny,
  keywords     = "john calhoun, henry clay, daniel webster, abolition,
    slavery, the constitution, nullification, the union, american government,
    congress, american politics",
  location     = "E 388.B73"
}

@Book{gtceo,
  author       = "Elinor Ostrom",
  title        = "Governing the Commons",
  subtitle     = "The Evolution of Institutions for Collective Action",
  publisher    = cup,
  year         = 1990,
  address      = cen,
  keywords     = "the commons, self-organization, self-governance,
    institutional change, institutional failures, ",
  location     = "HD 1286 O97"
}

@Book{cnw,
  author       = "Nico Walker",
  title        = "Cherry",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "drug abuse, iraq, bank robbery",
  location     = "PS 3623.A359552 C54"
}

@Book{cijjrl,
  author       = "Joe~R. Lansdale",
  title        = "Cold in July",
  publisher    = "Bantam Books",
  year         = 1989,
  address      = nyny,
  keywords     = "murrdaar, witness protection",
  location     = "https://lccn.loc.gov/00520681"
}

@Book{tmdbdak,
  author       = "David~A. Kaplan",
  title        = "The Most Dangerous Branch",
  subtitle     = "Inside the Supreme Court's Assault on the Constitution",
  publisher    = "Crown",
  year         = 2018,
  address      = nyny,
  keywords     = "u.s. supreme court, judicial restraint, judicial philosophy,
    u.s. government, separation of powers",
  location     = "KF 8779.K37"
}

@Book{pubs,
  author       = "Bruce Sterling",
  title        = "Pirate Utopia",
  publisher    = "Tachyon Publishing",
  year         = 2016,
  address      = sfca,
  keywords     = "wwi, yugoslavia, engineers, pirates, fascism",
  location     = "PS 3569.T3876 P57"
}

@Book{otcrhm,
  author       = "Martin, Roger H.",
  title        = "Off to College",
  subtitle     = "A Guide for Parents",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "first-year students, student orientation, athletics,
    substance abuse, special needs students",
  location     = "LB 2343.32.M37"
}

@Book{kchm,
  author       = "Haruki Murakami",
  title        = "Killing Commendatore",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "artists, the mysterious",
  location     = "PL 856.U673 K5713"
}

@Book{lott,
  author       = "Catherine Merridale",
  title        = "Lenin on the Train",
  publisher    = "Metropolitan Books",
  year         = 2017,
  address      = nyny,
  keywords     = "russia, revolution, wwi, lenin, socialism, espionage,
    sabotage",
  location     = "DK 254.L443 M37"
}

@Book{aatps,
  author       = "Ernest~G. Manes and Michael~A. Arbib",
  title        = "Algebraic Approaches to Program Semantics",
  publisher    = sv,
  year         = 1986,
  series       = "Texts and Monographs in Computer Science",
  address      = nyny,
  keywords     = "program semantics, denotational semantics, category theory,
    assertion semantics, specification, recursion, order semantics, fixed
    points, metric spaces, functors, data types, parametric specifications
    equational specification",
  location     = "QA 76.7.M34"
}

@Book{nodnf,
  author       = "Nuruddin Farah",
  title        = "North of Dawn",
  publisher    = "Riverhead Books",
  year         = 2018,
  address      = nyny,
  keywords     = "immigration, terrorism, islam, samalia, family relations",
  location     = "PR 9396.9.F3 N6"
}

@Book{hsnws,
  author       = "William Stallings",
  title        = "High-Speed Networks",
  subtitle     = "TCP/IP and ATM Design Principles",
  publisher    = ph,
  year         = 1998,
  address      = srnj,
  keywords     = "tcp/ip, acm, network protocols, data networks, high-speed
    lans, performance modeling, queuing analysis, self-similar traffic,
    link-level flow and error control, transport-level traffic control,
    internetwork traffic management, internet routing, routing protocols,
    multimedia routing, information theory, compression",
  location     = "TK 5105.585.S73"
}

@Book{ohip,
  author       = "Karyn~L. Freedman",
  title        = "One Hour in Paris",
  subtitle     = "A True Story of Rape and Recovery",
  publisher    = ucp,
  year         = 2014,
  address      = chil,
  keywords     = "rape, recovery",
  location     = "B 995.F744 A3"
}

@Book{lxjw,
  author       = "Josephine Wilkinson",
  title        = "Louis {XIV}",
  subtitle     = "The Power and the Glory",
  publisher    = "Pegasus Books",
  year         = 2019,
  address      = nyny,
  month        = mar,
  keywords     = "louie da fourteenth, france history, 17th century history,
    absolute monarchy",
  location     = "https://lccn.loc.gov/2018439183"
}

@Book{fftj,
  author       = "Margery Allingham",
  title        = "Flowers for the Judge",
  publisher    = "Bantam",
  year         = 1984,
  address      = nyny,
  month        = mar,
  keywords     = "murrdaar, publishing",
  location     = "PR 6001.L678"
}

@Book{psevh,
  author       = "Eric van Herwijnen",
  title        = "Practical {SGML}",
  publisher    = "Kluwer Academic",
  year         = 1990,
  address      = "Dordrecht, The Netherlands",
  keywords     = "sgml, document structure, iso standard",
  location     = "QA 76.73.S44 V36"
}

@Book{twetf,
  author       = "Tana French",
  title        = "The Witch Elm",
  publisher    = "Viking",
  year         = 2018,
  address      = nyny,
  keywords     = "murrdaar, memory, self-hood",
  location     = "PR 6106.R457 W58"
}

@Book{ddmjb,
  author       = "Michael~J. Behe",
  title        = "Darwin Devolves",
  subtitle     = "The New Science About DNA That Challenges Evolution",
  publisher    = "HarperOne",
  year         = 2019,
  address      = nyny,
  keywords     = "irreducible complexity, evolution, mutation, natural descent",
  location     = "QH 3673.B427"
}

@Misc{1mmmitxss,
  author       = "Michael Steil",
  title        = "17 Mistakes {Microsoft} Made in the {Xbox} Security System",
  booktitle    = "22nd Chaos Communication Congress (22C3)",
  year         = 2005,
  month        = "27--30 " # dec,
  address      = "Berlin, Germany",
  keywords     = "security, xbox, bootloader, encryption, hashing",
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

@Misc{htbaggssa,
  author       = "Marie desJardins",
  title        = "How to be a good graduate student\slash advisor",
  howpublished = "on the web",
  year         = 1994,
  month        = mar,
  keywords     = "graduate school, scholarship",
  abstract     = "This paper attempts to raise some issues that are important
    for graduate students to be successful and to get as much out of the
    process as possible, and for advisors who wish to help their students be
    successful.  The intent is not to provide prescriptive advice -- no
    formulas for finishing a thesis or twelve-step programs for becoming a
    better advisor are given -- but to raise awareness on both sides of the
    advisor-student relationship as to what the expectations are and should be
    for this relationship, what a graduate student should expect to accomplish,
    common problems, and where to go if the advisor is not forthcoming.",
  location     = "http://heibeck.freeshell.org/Grad_Advice/how2b/how.2b.html"
}

@Misc{bptf14,
  author       = "Paul Heckbert",
  title        = "Brief {Postscript} tutoral for 15-462",
  year         = 1997,
  month        = "18 " # sep,
  keywords     = "postscript, debugging, operators",
  location     = "https://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/98/pub/www/assts/ps.html"
}

@Misc{aascfs,
  author       = "Charles~F. Schmidt",
  title        = "{AI} and Search",
  keywords     = "exhaustive search, backtracking, depth-first search,
    breadth-first search, hill climbing"
}

@TechReport{djplm,
  author       = "Peter Haggar",
  title        = "Dispelling {Java} Programming Language Myths",
  institution  = "IBM developerWorks Journal",
  year         = 2001,
  month        = oct,
  keywords     = "garbage collection, reference parameters, atomic operations,
    synchronization, threads, rtsj"
}

@TechReport{domdl1s,
  author       = "Vidur Apparao and Steve Byrne and Mike Champion and Scott Isaacs and Arnaud {Le Hors} and Gavin Nicol and Jonathan Robie and Peter Sharpe and Bill Smith and Jared Sorensen and Robert Sutor and Ray Whitmer and Chris Wilson",
  title        = "{Document Object Model} ({DOM}) Level 1 Specification",
  institution  = "W3C",
  year         = 1998,
  number       = "REC-DOM-Level-1-19981001",
  month        = sep,
  keywords     = "dom, html, idl",
  abstract     = "This specification defines the Document Object Model Level 1,
    a platform- and language-neutral interface that allows programs and scripts
    to dynamically access and update the content, structure and style of
    documents.  The Document Object Model provides a standard set of objects
    for representing HTML and XML documents, a standard model of how these
    objects can be combined, and a standard interface for accessing and
    manipulating them.  Vendors can support the DOM as an interface to their
    proprietary data structures and APIs, and content authors can write to the
    standard DOM interfaces rather than product-specific APIs, thus increasing
    interoperability on the Web.  The goal of the DOM specification is to
    define a programmatic interface for XML and HTML.  The DOM Level 1
    specification is separated into two parts: Core and HTML.  The Core DOM
    Level 1 section provides a low-level set of fundamental interfaces that can
    represent any structured document, as well as defining extended interfaces
    for representing an XML document.  These extended XML interfaces need not
    be implemented by a DOM implementation that only provides access to HTML
    documents; all of the fundamental interfaces in the Core section must be
    implemented.  A compliant DOM implementation that implements the extended
    XML interfaces is required to also implement the fundamental Core
    interfaces, but not the HTML interfaces.  The HTML Level 1 section provides
    additional, higher-level interfaces that are used with the fundamental
    interfaces defined in the Core Level 1 section to provide a more convenient
    view of an HTML document.  A compliant implementation of the HTML DOM
    implements all of the fundamental Core interfaces as well as the HTML
    interfaces.", 
  location     = "https://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/"
}

@TechReport{mlwal,
  author       = "Keith Smillie",
  title        = "My Life with Array Languages",
  institution  = dcs # "University of Alberta",
  year         = 2005,
  address      = "Alberta, Canada",
  keywords     = "apl, nail, j",
  location     = "https://webdocs.cs.ualberta.ca/~smillie/Jpage/MyLife.pdf"
}

@Manual{wdud,
  title        = "Writing Documentation Using DocBook",
  author       = "David Rugge and Mark Galassi and Eric Bischoff",
  year         = 2006,
  keywords     = "docbook",
  location     = "https://web.fe.up.pt/~jmcruz/etc/web/crash-course.pdf"
}


