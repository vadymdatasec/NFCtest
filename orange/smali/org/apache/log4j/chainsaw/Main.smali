.class public Lorg/apache/log4j/chainsaw/Main;
.super Ljavax/swing/JFrame;
.source "SourceFile"


# static fields
.field public static final PORT_PROP_NAME:Ljava/lang/String; = "chainsaw.port"

.field public static final a:Lorg/apache/log4j/Logger;

.field public static synthetic b:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/chainsaw/Main;->b:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.chainsaw.Main"

    invoke-static {v0}, Lorg/apache/log4j/chainsaw/Main;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/chainsaw/Main;->b:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/chainsaw/Main;->a:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const-string v0, "CHAINSAW"

    const-string v1, "CHAINSAW - Log4J Log Viewer"

    .line 1
    invoke-direct {p0, v1}, Ljavax/swing/JFrame;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v1, Lm/a/b/h/r;

    invoke-direct {v1}, Lm/a/b/h/r;-><init>()V

    .line 3
    new-instance v2, Ljavax/swing/JMenuBar;

    invoke-direct {v2}, Ljavax/swing/JMenuBar;-><init>()V

    .line 4
    invoke-virtual {p0, v2}, Lorg/apache/log4j/chainsaw/Main;->setJMenuBar(Ljavax/swing/JMenuBar;)V

    .line 5
    new-instance v3, Ljavax/swing/JMenu;

    const-string v4, "File"

    invoke-direct {v3, v4}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2, v3}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v4, Lm/a/b/h/l;

    invoke-direct {v4, p0, v1}, Lm/a/b/h/l;-><init>(Ljavax/swing/JFrame;Lm/a/b/h/r;)V

    .line 8
    new-instance v5, Ljavax/swing/JMenuItem;

    const-string v6, "Load file..."

    invoke-direct {v5, v6}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3, v5}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 10
    invoke-virtual {v5, v4}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    .line 11
    sget-object v5, Lorg/apache/log4j/chainsaw/Main;->a:Lorg/apache/log4j/Logger;

    const-string v6, "Unable to create the action to load XML files"

    invoke-virtual {v5, v6, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    const-string v4, "Unable to create a XML parser - unable to load XML events."

    .line 12
    invoke-static {p0, v4, v0, v2}, Ljavax/swing/JOptionPane;->showMessageDialog(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V

    goto :goto_0

    :catch_1
    move-exception v4

    .line 13
    sget-object v5, Lorg/apache/log4j/chainsaw/Main;->a:Lorg/apache/log4j/Logger;

    const-string v6, "Missing classes for XML parser"

    invoke-virtual {v5, v6, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    const-string v4, "XML parser not in classpath - unable to load XML events."

    .line 14
    invoke-static {p0, v4, v0, v2}, Ljavax/swing/JOptionPane;->showMessageDialog(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 15
    :goto_0
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v4, "Exit"

    invoke-direct {v0, v4}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v3, v0}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 17
    sget-object v3, Lm/a/b/h/k;->a:Lm/a/b/h/k;

    invoke-virtual {v0, v3}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 18
    new-instance v0, Lm/a/b/h/h;

    invoke-direct {v0, v1}, Lm/a/b/h/h;-><init>(Lm/a/b/h/r;)V

    .line 19
    invoke-virtual {p0}, Lorg/apache/log4j/chainsaw/Main;->getContentPane()Ljava/awt/Container;

    move-result-object v3

    const-string v4, "North"

    invoke-virtual {v3, v0, v4}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 20
    new-instance v0, Ljavax/swing/JTable;

    invoke-direct {v0, v1}, Ljavax/swing/JTable;-><init>(Ljavax/swing/table/TableModel;)V

    .line 21
    invoke-virtual {v0, v2}, Ljavax/swing/JTable;->setSelectionMode(I)V

    .line 22
    new-instance v3, Ljavax/swing/JScrollPane;

    invoke-direct {v3, v0}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V

    const-string v4, "Events: "

    .line 23
    invoke-static {v4}, Ljavax/swing/BorderFactory;->createTitledBorder(Ljava/lang/String;)Ljavax/swing/border/TitledBorder;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljavax/swing/JScrollPane;->setBorder(Ljavax/swing/border/Border;)V

    .line 24
    new-instance v4, Ljava/awt/Dimension;

    const/16 v5, 0x12c

    const/16 v6, 0x384

    invoke-direct {v4, v6, v5}, Ljava/awt/Dimension;-><init>(II)V

    invoke-virtual {v3, v4}, Ljavax/swing/JScrollPane;->setPreferredSize(Ljava/awt/Dimension;)V

    .line 25
    new-instance v4, Lm/a/b/h/i;

    invoke-direct {v4, v0, v1}, Lm/a/b/h/i;-><init>(Ljavax/swing/JTable;Lm/a/b/h/r;)V

    .line 26
    new-instance v0, Ljava/awt/Dimension;

    invoke-direct {v0, v6, v5}, Ljava/awt/Dimension;-><init>(II)V

    invoke-virtual {v4, v0}, Ljavax/swing/JPanel;->setPreferredSize(Ljava/awt/Dimension;)V

    .line 27
    new-instance v0, Ljavax/swing/JSplitPane;

    invoke-direct {v0, v2, v3, v4}, Ljavax/swing/JSplitPane;-><init>(ILjava/awt/Component;Ljava/awt/Component;)V

    .line 28
    invoke-virtual {p0}, Lorg/apache/log4j/chainsaw/Main;->getContentPane()Ljava/awt/Container;

    move-result-object v2

    const-string v3, "Center"

    invoke-virtual {v2, v0, v3}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 29
    new-instance v0, Lm/a/b/h/o;

    invoke-direct {v0, p0}, Lm/a/b/h/o;-><init>(Lorg/apache/log4j/chainsaw/Main;)V

    invoke-virtual {p0, v0}, Lorg/apache/log4j/chainsaw/Main;->addWindowListener(Ljava/awt/event/WindowListener;)V

    .line 30
    invoke-virtual {p0}, Lorg/apache/log4j/chainsaw/Main;->pack()V

    const/4 v0, 0x1

    .line 31
    invoke-virtual {p0, v0}, Lorg/apache/log4j/chainsaw/Main;->setVisible(Z)V

    .line 32
    invoke-virtual {p0, v1}, Lorg/apache/log4j/chainsaw/Main;->a(Lm/a/b/h/r;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method public static a()V
    .locals 3

    .line 12
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    const-string v1, "log4j.rootLogger"

    const-string v2, "DEBUG, A1"

    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "log4j.appender.A1"

    const-string v2, "org.apache.log4j.ConsoleAppender"

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "log4j.appender.A1.layout"

    const-string v2, "org.apache.log4j.TTCCLayout"

    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    invoke-static {v0}, Lorg/apache/log4j/PropertyConfigurator;->configure(Ljava/util/Properties;)V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {}, Lorg/apache/log4j/chainsaw/Main;->a()V

    .line 2
    new-instance p0, Lorg/apache/log4j/chainsaw/Main;

    invoke-direct {p0}, Lorg/apache/log4j/chainsaw/Main;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm/a/b/h/r;)V
    .locals 7

    const-string v0, "chainsaw.port"

    .line 2
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "CHAINSAW"

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4
    :catch_0
    sget-object v4, Lorg/apache/log4j/chainsaw/Main;->a:Lorg/apache/log4j/Logger;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "Unable to parse chainsaw.port property with value "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/apache/log4j/Category;->fatal(Ljava/lang/Object;)V

    .line 5
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Unable to parse port number from \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "\', quitting."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v3, v2}, Ljavax/swing/JOptionPane;->showMessageDialog(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 6
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    :cond_0
    const/16 v0, 0x115d

    .line 7
    :goto_0
    :try_start_1
    new-instance v4, Lm/a/b/h/n;

    invoke-direct {v4, p1, v0}, Lm/a/b/h/n;-><init>(Lm/a/b/h/r;I)V

    .line 8
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 9
    sget-object v4, Lorg/apache/log4j/chainsaw/Main;->a:Lorg/apache/log4j/Logger;

    const-string v5, "Unable to connect to socket server, quiting"

    invoke-virtual {v4, v5, p1}, Lorg/apache/log4j/Category;->fatal(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 10
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "Unable to create socket on port "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v0, ", quitting."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v3, v2}, Ljavax/swing/JOptionPane;->showMessageDialog(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 11
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    :goto_1
    return-void
.end method
