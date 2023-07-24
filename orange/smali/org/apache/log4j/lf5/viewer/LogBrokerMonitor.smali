.class public Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor$a;
    }
.end annotation


# static fields
.field public static final DETAILED_VIEW:Ljava/lang/String; = "Detailed"


# instance fields
.field public a:Ljavax/swing/JFrame;

.field public b:I

.field public c:I

.field public d:Lorg/apache/log4j/lf5/viewer/LogTable;

.field public e:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

.field public f:Ljava/lang/String;

.field public g:Ljavax/swing/JScrollPane;

.field public h:Ljavax/swing/JLabel;

.field public i:Ljavax/swing/JComboBox;

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Ljava/util/List;

.field public q:Ljava/util/Map;

.field public r:Ljava/util/Map;

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public u:Z

.field public v:Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x226

    .line 2
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b:I

    const/16 v0, 0x1f4

    .line 3
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c:I

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->f:Ljava/lang/String;

    .line 5
    sget-object v0, Lorg/apache/log4j/lf5/LogLevel;->DEBUG:Lorg/apache/log4j/lf5/LogLevel;

    const/16 v0, 0xa

    .line 6
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j:I

    const-string v0, "Dialog"

    .line 7
    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->k:Ljava/lang/String;

    const-string v0, "Detailed"

    .line 8
    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->l:Ljava/lang/String;

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->m:Z

    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->n:Z

    .line 11
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z

    .line 12
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->p:Ljava/util/List;

    .line 13
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->q:Ljava/util/Map;

    .line 14
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->r:Ljava/util/Map;

    const/4 v2, 0x0

    .line 15
    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->s:Ljava/util/List;

    .line 16
    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->t:Ljava/util/List;

    .line 17
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u:Z

    .line 18
    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->v:Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;

    .line 19
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->s:Ljava/util/List;

    .line 20
    invoke-static {}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLogTableColumns()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->t:Ljava/util/List;

    const-string p1, "monitor.exit"

    .line 21
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "false"

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "true"

    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 24
    iput-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z

    .line 25
    :cond_1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->H()V

    .line 26
    iget-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor$a;

    invoke-direct {v0, p0, p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor$a;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {p1, v0}, Ljavax/swing/JFrame;->addWindowListener(Ljava/awt/event/WindowListener;)V

    return-void
.end method


# virtual methods
.method public A()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Reset LogLevel Colors"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x72

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/b;

    invoke-direct {v1, p0}, Lm/a/b/j/b/b;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public B()Ljavax/swing/JPanel;
    .locals 4

    .line 1
    new-instance v0, Ljavax/swing/JPanel;

    invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V

    .line 2
    new-instance v1, Ljavax/swing/JLabel;

    const-string v2, "No log records to display."

    invoke-direct {v1, v2}, Ljavax/swing/JLabel;-><init>(Ljava/lang/String;)V

    .line 3
    iput-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->h:Ljavax/swing/JLabel;

    const/4 v2, 0x2

    .line 4
    invoke-virtual {v1, v2}, Ljavax/swing/JLabel;->setHorizontalAlignment(I)V

    .line 5
    invoke-static {}, Ljavax/swing/BorderFactory;->createEtchedBorder()Ljavax/swing/border/Border;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljavax/swing/JPanel;->setBorder(Ljavax/swing/border/Border;)V

    .line 6
    new-instance v2, Ljava/awt/FlowLayout;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v3}, Ljava/awt/FlowLayout;-><init>(III)V

    invoke-virtual {v0, v2}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V

    .line 7
    invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    return-object v0
.end method

.method public C()Ljavax/swing/JToolBar;
    .locals 7

    .line 1
    new-instance v0, Ljavax/swing/JToolBar;

    invoke-direct {v0}, Ljavax/swing/JToolBar;-><init>()V

    .line 2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "JToolBar.isRollover"

    invoke-virtual {v0, v2, v1}, Ljavax/swing/JToolBar;->putClientProperty(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    new-instance v1, Ljavax/swing/JComboBox;

    invoke-direct {v1}, Ljavax/swing/JComboBox;-><init>()V

    .line 4
    new-instance v2, Ljavax/swing/JComboBox;

    invoke-direct {v2}, Ljavax/swing/JComboBox;-><init>()V

    .line 5
    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->i:Ljavax/swing/JComboBox;

    .line 6
    const-class v3, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-nez v3, :cond_0

    .line 7
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    :cond_0
    const-string v4, "org/apache/log4j/lf5/viewer/images/channelexplorer_new.gif"

    .line 8
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 9
    new-instance v4, Ljavax/swing/ImageIcon;

    invoke-direct {v4, v3}, Ljavax/swing/ImageIcon;-><init>(Ljava/net/URL;)V

    .line 10
    :cond_1
    new-instance v3, Ljavax/swing/JButton;

    const-string v5, "Clear Log Table"

    invoke-direct {v3, v5}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V

    if-eqz v4, :cond_2

    .line 11
    invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setIcon(Ljavax/swing/Icon;)V

    :cond_2
    const-string v4, "Clear Log Table."

    .line 12
    invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setToolTipText(Ljava/lang/String;)V

    .line 13
    new-instance v4, Lm/a/b/j/b/v;

    invoke-direct {v4, p0}, Lm/a/b/j/b/v;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v3, v4}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 14
    invoke-static {}, Ljava/awt/Toolkit;->getDefaultToolkit()Ljava/awt/Toolkit;

    move-result-object v4

    .line 15
    iget-boolean v5, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->m:Z

    if-eqz v5, :cond_3

    .line 16
    invoke-static {}, Ljava/awt/GraphicsEnvironment;->getLocalGraphicsEnvironment()Ljava/awt/GraphicsEnvironment;

    move-result-object v4

    invoke-virtual {v4}, Ljava/awt/GraphicsEnvironment;->getAvailableFontFamilyNames()[Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {v4}, Ljava/awt/Toolkit;->getFontList()[Ljava/lang/String;

    move-result-object v4

    :goto_0
    const/4 v5, 0x0

    .line 18
    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_4

    .line 19
    aget-object v6, v4, v5

    invoke-virtual {v1, v6}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 20
    :cond_4
    iget-object v4, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->k:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljavax/swing/JComboBox;->setSelectedItem(Ljava/lang/Object;)V

    .line 21
    new-instance v4, Lm/a/b/j/b/x;

    invoke-direct {v4, p0}, Lm/a/b/j/b/x;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v1, v4}, Ljavax/swing/JComboBox;->addActionListener(Ljava/awt/event/ActionListener;)V

    const-string v4, "8"

    .line 22
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "9"

    .line 23
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "10"

    .line 24
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "12"

    .line 25
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "14"

    .line 26
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "16"

    .line 27
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "18"

    .line 28
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    const-string v4, "24"

    .line 29
    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V

    .line 30
    iget v4, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->setSelectedItem(Ljava/lang/Object;)V

    .line 31
    new-instance v4, Lm/a/b/j/b/y;

    invoke-direct {v4, p0}, Lm/a/b/j/b/y;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 32
    new-instance v4, Ljavax/swing/JLabel;

    const-string v5, " Font: "

    invoke-direct {v4, v5}, Ljavax/swing/JLabel;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 33
    invoke-virtual {v0, v1}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 34
    invoke-virtual {v0, v2}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 35
    invoke-virtual {v0}, Ljavax/swing/JToolBar;->addSeparator()V

    .line 36
    invoke-virtual {v0}, Ljavax/swing/JToolBar;->addSeparator()V

    .line 37
    invoke-virtual {v0, v3}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;

    const/high16 v4, 0x3f000000    # 0.5f

    .line 38
    invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setAlignmentY(F)V

    .line 39
    invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setAlignmentX(F)V

    .line 40
    invoke-virtual {v1}, Ljavax/swing/JComboBox;->getPreferredSize()Ljava/awt/Dimension;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljavax/swing/JComboBox;->setMaximumSize(Ljava/awt/Dimension;)V

    .line 41
    invoke-virtual {v2}, Ljavax/swing/JComboBox;->getPreferredSize()Ljava/awt/Dimension;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljavax/swing/JComboBox;->setMaximumSize(Ljava/awt/Dimension;)V

    return-object v0
.end method

.method public D()Ljavax/swing/JMenu;
    .locals 3

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "View"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x76

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->F()Ljava/util/Iterator;

    move-result-object v1

    .line 4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 8
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->x()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    return-object v0
.end method

.method public E()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public F()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public G()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->getRowCount()I

    move-result v1

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->getTotalRowCount()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public H()V
    .locals 6

    .line 1
    new-instance v0, Ljavax/swing/JFrame;

    const-string v1, "LogFactor5"

    invoke-direct {v0, v1}, Ljavax/swing/JFrame;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JFrame;->setDefaultCloseOperation(I)V

    .line 3
    const-class v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    const-string v2, "/org/apache/log4j/lf5/viewer/images/lf5_small_icon.gif"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    new-instance v3, Ljavax/swing/ImageIcon;

    invoke-direct {v3, v0}, Ljavax/swing/ImageIcon;-><init>(Ljava/net/URL;)V

    invoke-virtual {v3}, Ljavax/swing/ImageIcon;->getImage()Ljava/awt/Image;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljavax/swing/JFrame;->setIconImage(Ljava/awt/Image;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->J()V

    .line 6
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->i()Ljavax/swing/JTextArea;

    move-result-object v0

    .line 7
    new-instance v2, Ljavax/swing/JScrollPane;

    invoke-direct {v2, v0}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V

    .line 8
    new-instance v3, Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-direct {v3, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;-><init>(Ljavax/swing/JTextArea;)V

    iput-object v3, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    .line 9
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->l:Ljava/lang/String;

    invoke-virtual {p0, v0, v3}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljava/lang/String;Lorg/apache/log4j/lf5/viewer/LogTable;)V

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    new-instance v3, Ljava/awt/Font;

    iget-object v4, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->k:Ljava/lang/String;

    iget v5, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j:I

    invoke-direct {v3, v4, v1, v5}, Ljava/awt/Font;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v3}, Lorg/apache/log4j/lf5/viewer/LogTable;->setFont(Ljava/awt/Font;)V

    .line 11
    new-instance v0, Ljavax/swing/JScrollPane;

    iget-object v3, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-direct {v0, v3}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->g:Ljavax/swing/JScrollPane;

    .line 12
    iget-boolean v3, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->n:Z

    if-eqz v3, :cond_1

    .line 13
    invoke-virtual {v0}, Ljavax/swing/JScrollPane;->getVerticalScrollBar()Ljavax/swing/JScrollBar;

    move-result-object v0

    new-instance v3, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;

    invoke-direct {v3}, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;-><init>()V

    invoke-virtual {v0, v3}, Ljavax/swing/JScrollBar;->addAdjustmentListener(Ljava/awt/event/AdjustmentListener;)V

    .line 14
    :cond_1
    new-instance v0, Ljavax/swing/JSplitPane;

    invoke-direct {v0}, Ljavax/swing/JSplitPane;-><init>()V

    const/4 v3, 0x1

    .line 15
    invoke-virtual {v0, v3}, Ljavax/swing/JSplitPane;->setOneTouchExpandable(Z)V

    .line 16
    invoke-virtual {v0, v1}, Ljavax/swing/JSplitPane;->setOrientation(I)V

    .line 17
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->g:Ljavax/swing/JScrollPane;

    invoke-virtual {v0, v1}, Ljavax/swing/JSplitPane;->setLeftComponent(Ljava/awt/Component;)V

    .line 18
    invoke-virtual {v0, v2}, Ljavax/swing/JSplitPane;->setRightComponent(Ljava/awt/Component;)V

    const/16 v1, 0x15e

    .line 19
    invoke-virtual {v0, v1}, Ljavax/swing/JSplitPane;->setDividerLocation(I)V

    .line 20
    new-instance v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

    invoke-direct {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;-><init>()V

    iput-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

    .line 21
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v1

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u()Lorg/apache/log4j/lf5/LogRecordFilter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->setLogRecordFilter(Lorg/apache/log4j/lf5/LogRecordFilter;)V

    .line 22
    new-instance v1, Ljavax/swing/JScrollPane;

    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

    invoke-direct {v1, v2}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V

    .line 23
    new-instance v2, Ljava/awt/Dimension;

    const/16 v4, 0x190

    const/16 v5, 0x82

    invoke-direct {v2, v5, v4}, Ljava/awt/Dimension;-><init>(II)V

    invoke-virtual {v1, v2}, Ljavax/swing/JScrollPane;->setPreferredSize(Ljava/awt/Dimension;)V

    .line 24
    new-instance v2, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;

    invoke-direct {v2}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;-><init>()V

    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->v:Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;

    .line 25
    new-instance v2, Ljavax/swing/JSplitPane;

    invoke-direct {v2}, Ljavax/swing/JSplitPane;-><init>()V

    .line 26
    invoke-virtual {v2, v3}, Ljavax/swing/JSplitPane;->setOneTouchExpandable(Z)V

    .line 27
    invoke-virtual {v2, v0}, Ljavax/swing/JSplitPane;->setRightComponent(Ljava/awt/Component;)V

    .line 28
    invoke-virtual {v2, v1}, Ljavax/swing/JSplitPane;->setLeftComponent(Ljava/awt/Component;)V

    .line 29
    invoke-virtual {v2, v5}, Ljavax/swing/JSplitPane;->setDividerLocation(I)V

    .line 30
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {v0}, Ljavax/swing/JFrame;->getRootPane()Ljavax/swing/JRootPane;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->v()Ljavax/swing/JMenuBar;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JRootPane;->setJMenuBar(Ljavax/swing/JMenuBar;)V

    .line 31
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {v0}, Ljavax/swing/JFrame;->getContentPane()Ljava/awt/Container;

    move-result-object v0

    const-string v1, "Center"

    invoke-virtual {v0, v2, v1}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 32
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {v0}, Ljavax/swing/JFrame;->getContentPane()Ljava/awt/Container;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->C()Ljavax/swing/JToolBar;

    move-result-object v1

    const-string v2, "North"

    invoke-virtual {v0, v1, v2}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 33
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {v0}, Ljavax/swing/JFrame;->getContentPane()Ljava/awt/Container;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->B()Ljavax/swing/JPanel;

    move-result-object v1

    const-string v2, "South"

    invoke-virtual {v0, v1, v2}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 34
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->I()V

    .line 35
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a()V

    .line 36
    new-instance v0, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;

    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-direct {v0, p0, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/LogTable;)V

    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    new-instance v0, Lm/a/b/j/b/d0;

    invoke-direct {v0, p0}, Lm/a/b/j/b/d0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-void
.end method

.method public J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    iget v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b:I

    iget v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c:I

    invoke-virtual {v0, v1, v2}, Ljavax/swing/JFrame;->setSize(II)V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljavax/swing/JFrame;)V

    return-void
.end method

.method public K()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->h:Ljavax/swing/JLabel;

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JLabel;->setText(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljavax/swing/JComboBox;I)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljavax/swing/JComboBox;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v1}, Ljavax/swing/JComboBox;->getItemAt(I)Ljava/lang/Object;

    move-result-object v2

    .line 3
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    invoke-virtual {p1, v1}, Ljavax/swing/JComboBox;->getItemAt(I)Ljava/lang/Object;

    move-result-object v4

    .line 5
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v3, v5, :cond_0

    if-gt v5, p2, :cond_0

    move-object v2, v4

    move v3, v5

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1, v2}, Ljavax/swing/JComboBox;->setSelectedItem(Ljava/lang/Object;)V

    return v3
.end method

.method public a(II)Ljava/lang/String;
    .locals 2

    .line 13
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Displaying: "

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, " records out of a total of: "

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, " records."

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;
    .locals 2

    .line 20
    new-instance v0, Ljavax/swing/JCheckBoxMenuItem;

    invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;->setSelected(Z)V

    .line 22
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->setMnemonic(C)V

    .line 23
    new-instance p1, Lm/a/b/j/b/d;

    invoke-direct {p1, p0}, Lm/a/b/j/b/d;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public a(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
    .locals 2

    .line 24
    new-instance v0, Ljavax/swing/JCheckBoxMenuItem;

    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;->setSelected(Z)V

    .line 26
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->setMnemonic(C)V

    .line 27
    new-instance p1, Lm/a/b/j/b/e;

    invoke-direct {p1, p0}, Lm/a/b/j/b/e;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecordFilter;
    .locals 0

    .line 8
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->f:Ljava/lang/String;

    .line 9
    new-instance p1, Lm/a/b/j/b/a0;

    invoke-direct {p1, p0}, Lm/a/b/j/b/a0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    return-object p1
.end method

.method public a()V
    .locals 2

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v0

    .line 11
    new-instance v1, Lm/a/b/j/b/b0;

    invoke-direct {v1, p0}, Lm/a/b/j/b/b0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addDisplayedProperty(Ljava/lang/Object;)V

    .line 12
    new-instance v1, Lm/a/b/j/b/c0;

    invoke-direct {v1, p0, v0}, Lm/a/b/j/b/c0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;)V

    invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addDisplayedProperty(Ljava/lang/Object;)V

    return-void
.end method

.method public a(I)V
    .locals 2

    int-to-long v0, p1

    .line 7
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public a(Ljava/lang/String;Lorg/apache/log4j/lf5/viewer/LogTable;)V
    .locals 1

    const-string v0, "Detailed"

    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p2}, Lorg/apache/log4j/lf5/viewer/LogTable;->setDetailedView()V

    .line 37
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->l:Ljava/lang/String;

    return-void

    .line 38
    :cond_0
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "does not match a supported view."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 39
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(Ljavax/swing/JFrame;)V
    .locals 4

    .line 40
    invoke-static {}, Ljava/awt/Toolkit;->getDefaultToolkit()Ljava/awt/Toolkit;

    move-result-object v0

    invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;

    move-result-object v0

    .line 41
    invoke-virtual {p1}, Ljavax/swing/JFrame;->getSize()Ljava/awt/Dimension;

    move-result-object v1

    .line 42
    iget v2, v0, Ljava/awt/Dimension;->width:I

    iget v3, v1, Ljava/awt/Dimension;->width:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    iget v0, v0, Ljava/awt/Dimension;->height:I

    iget v1, v1, Ljava/awt/Dimension;->height:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v2, v0}, Ljavax/swing/JFrame;->setLocation(II)V

    return-void
.end method

.method public a(Ljavax/swing/JMenu;)V
    .locals 6

    .line 28
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->v:Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->getMRUFileList()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {p1}, Ljavax/swing/JMenu;->addSeparator()V

    const/4 v1, 0x0

    .line 30
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 31
    new-instance v2, Ljavax/swing/JMenuItem;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    aget-object v1, v0, v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v2, v4}, Ljavax/swing/JMenuItem;->setMnemonic(I)V

    .line 33
    new-instance v1, Lm/a/b/j/b/k;

    invoke-direct {v1, p0}, Lm/a/b/j/b/k;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v2, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 34
    invoke-virtual {p1, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    move v1, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public addDisplayedProperty(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMessage(Lorg/apache/log4j/lf5/LogRecord;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lm/a/b/j/b/w;

    invoke-direct {v0, p0, p1}, Lm/a/b/j/b/w;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/LogRecord;)V

    invoke-static {v0}, Ljavax/swing/SwingUtilities;->invokeLater(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
    .locals 2

    .line 7
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/swing/JCheckBoxMenuItem;

    check-cast v0, Ljavax/swing/JCheckBoxMenuItem;

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->r:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public b()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Show all LogLevels"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x73

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/e0;

    invoke-direct {v1, p0}, Lm/a/b/j/b/e0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public b(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JMenuItem;
    .locals 3

    .line 4
    new-instance v0, Ljavax/swing/JMenuItem;

    invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 6
    new-instance v1, Lm/a/b/j/b/c;

    invoke-direct {v1, p0, v0, p1}, Lm/a/b/j/b/c;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Ljavax/swing/JMenuItem;Lorg/apache/log4j/lf5/LogLevel;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public c(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/swing/JCheckBoxMenuItem;

    check-cast v0, Ljavax/swing/JCheckBoxMenuItem;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->q:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public c()Ljavax/swing/JMenuItem;
    .locals 2

    .line 4
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Show all Columns"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x73

    .line 5
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 6
    new-instance v1, Lm/a/b/j/b/f;

    invoke-direct {v1, p0}, Lm/a/b/j/b/f;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public d()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Close"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x63

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    const-string v1, "control Q"

    .line 3
    invoke-static {v1}, Ljavax/swing/KeyStroke;->getKeyStroke(Ljava/lang/String;)Ljavax/swing/KeyStroke;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setAccelerator(Ljavax/swing/KeyStroke;)V

    .line 4
    new-instance v1, Lm/a/b/j/b/j;

    invoke-direct {v1, p0}, Lm/a/b/j/b/j;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {v0}, Ljavax/swing/JFrame;->dispose()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u:Z

    .line 3
    iget-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :cond_0
    return-void
.end method

.method public e()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Set Max Number of Records"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x6d

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/p;

    invoke-direct {v1, p0}, Lm/a/b/j/b/p;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public f()Ljavax/swing/JMenu;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "Configure"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x63

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->h()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 4
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->g()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    return-object v0
.end method

.method public g()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Reset"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x72

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/o;

    invoke-direct {v1, p0}, Lm/a/b/j/b/o;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public getBaseFrame()Ljavax/swing/JFrame;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    return-object v0
.end method

.method public getCallSystemExitOnClose()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z

    return v0
.end method

.method public getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

    return-object v0
.end method

.method public getDateFormatManager()Lorg/apache/log4j/lf5/util/DateFormatManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getDateFormatManager()Lorg/apache/log4j/lf5/util/DateFormatManager;

    move-result-object v0

    return-object v0
.end method

.method public getLogLevelMenuItems()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->q:Ljava/util/Map;

    return-object v0
.end method

.method public getLogTableColumnMenuItems()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->r:Ljava/util/Map;

    return-object v0
.end method

.method public getNDCTextFilter()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getTableColumnMenuItem(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;

    move-result-object p1

    return-object p1
.end method

.method public h()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Save"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x73

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/n;

    invoke-direct {v1, p0}, Lm/a/b/j/b/n;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public hide()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/swing/JFrame;->setVisible(Z)V

    return-void
.end method

.method public i()Ljavax/swing/JTextArea;
    .locals 5

    .line 1
    new-instance v0, Ljavax/swing/JTextArea;

    invoke-direct {v0}, Ljavax/swing/JTextArea;-><init>()V

    .line 2
    new-instance v1, Ljava/awt/Font;

    const/4 v2, 0x0

    const-string v3, "Monospaced"

    const/16 v4, 0xe

    invoke-direct {v1, v3, v2, v4}, Ljava/awt/Font;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->setFont(Ljava/awt/Font;)V

    const/4 v1, 0x3

    .line 3
    invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->setTabSize(I)V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->setLineWrap(Z)V

    .line 5
    invoke-virtual {v0, v2}, Ljavax/swing/JTextArea;->setWrapStyleWord(Z)V

    return-object v0
.end method

.method public j()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Find"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x66

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    const-string v1, "control F"

    .line 3
    invoke-static {v1}, Ljavax/swing/KeyStroke;->getKeyStroke(Ljava/lang/String;)Ljavax/swing/KeyStroke;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setAccelerator(Ljavax/swing/KeyStroke;)V

    .line 4
    new-instance v1, Lm/a/b/j/b/s;

    invoke-direct {v1, p0}, Lm/a/b/j/b/s;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public k()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Find Next"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x6e

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    const-string v1, "F3"

    .line 3
    invoke-static {v1}, Ljavax/swing/KeyStroke;->getKeyStroke(Ljava/lang/String;)Ljavax/swing/KeyStroke;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setAccelerator(Ljavax/swing/KeyStroke;)V

    .line 4
    new-instance v1, Lm/a/b/j/b/r;

    invoke-direct {v1, p0}, Lm/a/b/j/b/r;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public l()Ljavax/swing/JMenu;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "Edit"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x65

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 4
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->k()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 5
    invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V

    .line 6
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->n()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->m()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    return-object v0
.end method

.method public m()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Restore all NDCs"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x72

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/u;

    invoke-direct {v1, p0}, Lm/a/b/j/b/u;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public n()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Sort by NDC"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x73

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/t;

    invoke-direct {v1, p0}, Lm/a/b/j/b/t;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public o()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Exit"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x78

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/m;

    invoke-direct {v1, p0}, Lm/a/b/j/b/m;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public p()Ljavax/swing/JMenu;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "File"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x66

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->y()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 4
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->z()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 5
    invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V

    .line 6
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 7
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljavax/swing/JMenu;)V

    .line 8
    invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    return-object v0
.end method

.method public q()Ljavax/swing/JMenu;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "Help"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x68

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->r()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    return-object v0
.end method

.method public r()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "LogFactor5 Properties"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x6c

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/q;

    invoke-direct {v1, p0}, Lm/a/b/j/b/q;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public s()Ljavax/swing/JMenu;
    .locals 3

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "Configure LogLevel Colors"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x63

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->E()Ljava/util/Iterator;

    move-result-object v1

    .line 4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/lf5/LogLevel;

    invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JMenuItem;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public setCallSystemExitOnClose(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z

    return-void
.end method

.method public setDateFormatManager(Lorg/apache/log4j/lf5/util/DateFormatManager;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setDateFormatManager(Lorg/apache/log4j/lf5/util/DateFormatManager;)V

    return-void
.end method

.method public setFontSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->i:Ljavax/swing/JComboBox;

    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljavax/swing/JComboBox;I)I

    return-void
.end method

.method public setFrameSize(II)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/awt/Toolkit;->getDefaultToolkit()Ljava/awt/Toolkit;

    move-result-object v0

    invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;

    move-result-object v0

    if-lez p1, :cond_0

    .line 2
    iget v1, v0, Ljava/awt/Dimension;->width:I

    if-ge p1, v1, :cond_0

    .line 3
    iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b:I

    :cond_0
    if-lez p2, :cond_1

    .line 4
    iget p1, v0, Ljava/awt/Dimension;->height:I

    if-ge p2, p1, :cond_1

    .line 5
    iput p2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c:I

    .line 6
    :cond_1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->J()V

    return-void
.end method

.method public setMaxNumberOfLogRecords(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->setMaxNumberOfLogRecords(I)V

    return-void
.end method

.method public setNDCLogRecordFilter(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v0

    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecordFilter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->setLogRecordFilter(Lorg/apache/log4j/lf5/LogRecordFilter;)V

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " - LogFactor5"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljavax/swing/JFrame;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public show()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->show(I)V

    return-void
.end method

.method public show(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    invoke-virtual {v0}, Ljavax/swing/JFrame;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lm/a/b/j/b/l;

    invoke-direct {v0, p0, p1}, Lm/a/b/j/b/l;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;I)V

    invoke-static {v0}, Ljavax/swing/SwingUtilities;->invokeLater(Ljava/lang/Runnable;)V

    return-void
.end method

.method public t()Ljavax/swing/JMenu;
    .locals 3

    .line 1
    new-instance v0, Ljavax/swing/JMenu;

    const-string v1, "Log Level"

    invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x6c

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->E()Ljava/util/Iterator;

    move-result-object v1

    .line 4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/lf5/LogLevel;

    invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 8
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->w()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 9
    invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->s()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    .line 11
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->A()Ljavax/swing/JMenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;

    return-object v0
.end method

.method public u()Lorg/apache/log4j/lf5/LogRecordFilter;
    .locals 1

    .line 1
    new-instance v0, Lm/a/b/j/b/z;

    invoke-direct {v0, p0}, Lm/a/b/j/b/z;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    return-object v0
.end method

.method public v()Ljavax/swing/JMenuBar;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuBar;

    invoke-direct {v0}, Ljavax/swing/JMenuBar;-><init>()V

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->p()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->l()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    .line 4
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->t()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->D()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    .line 6
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->f()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->q()Ljavax/swing/JMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;

    return-object v0
.end method

.method public w()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Hide all LogLevels"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x68

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/f0;

    invoke-direct {v1, p0}, Lm/a/b/j/b/f0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public x()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Hide all Columns"

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x68

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/g;

    invoke-direct {v1, p0}, Lm/a/b/j/b/g;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public y()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Open..."

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x6f

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/h;

    invoke-direct {v1, p0}, Lm/a/b/j/b/h;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method

.method public z()Ljavax/swing/JMenuItem;
    .locals 2

    .line 1
    new-instance v0, Ljavax/swing/JMenuItem;

    const-string v1, "Open URL..."

    invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x75

    .line 2
    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V

    .line 3
    new-instance v1, Lm/a/b/j/b/i;

    invoke-direct {v1, p0}, Lm/a/b/j/b/i;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V

    invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V

    return-object v0
.end method
