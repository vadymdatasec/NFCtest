.class public Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;
.super Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;
.source "SourceFile"


# static fields
.field public static final SIZE:I = 0x1e


# instance fields
.field public b:Ljavax/swing/JTextField;


# direct methods
.method public constructor <init>(Ljavax/swing/JFrame;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x1e

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljavax/swing/JFrame;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Z)V

    .line 3
    new-instance p1, Ljavax/swing/JPanel;

    invoke-direct {p1}, Ljavax/swing/JPanel;-><init>()V

    .line 4
    new-instance p2, Ljava/awt/FlowLayout;

    invoke-direct {p2}, Ljava/awt/FlowLayout;-><init>()V

    invoke-virtual {p1, p2}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V

    .line 5
    new-instance p2, Ljavax/swing/JPanel;

    invoke-direct {p2}, Ljavax/swing/JPanel;-><init>()V

    .line 6
    new-instance v0, Ljava/awt/FlowLayout;

    invoke-direct {v0}, Ljava/awt/FlowLayout;-><init>()V

    invoke-virtual {p2, v0}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V

    .line 7
    new-instance v0, Ljavax/swing/JLabel;

    invoke-direct {v0, p3}, Ljavax/swing/JLabel;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 8
    new-instance p3, Ljavax/swing/JTextField;

    invoke-direct {p3, p4}, Ljavax/swing/JTextField;-><init>(I)V

    iput-object p3, p0, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->b:Ljavax/swing/JTextField;

    .line 9
    invoke-virtual {p2, p3}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 10
    new-instance p3, Lm/a/b/j/b/h0;

    invoke-direct {p3, p0}, Lm/a/b/j/b/h0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;)V

    invoke-virtual {p0, p3}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->addKeyListener(Ljava/awt/event/KeyListener;)V

    .line 11
    new-instance p3, Ljavax/swing/JButton;

    const-string p4, "Ok"

    invoke-direct {p3, p4}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V

    .line 12
    new-instance p4, Lm/a/b/j/b/i0;

    invoke-direct {p4, p0}, Lm/a/b/j/b/i0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;)V

    invoke-virtual {p3, p4}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 13
    new-instance p4, Ljavax/swing/JButton;

    const-string v0, "Cancel"

    invoke-direct {p4, v0}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V

    .line 14
    new-instance v0, Lm/a/b/j/b/j0;

    invoke-direct {v0, p0}, Lm/a/b/j/b/j0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;)V

    invoke-virtual {p4, v0}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 15
    invoke-virtual {p1, p3}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 16
    invoke-virtual {p1, p4}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 17
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->getContentPane()Ljava/awt/Container;

    move-result-object p3

    const-string p4, "Center"

    invoke-virtual {p3, p2, p4}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->getContentPane()Ljava/awt/Container;

    move-result-object p2

    const-string p3, "South"

    invoke-virtual {p2, p1, p3}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 19
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->pack()V

    .line 20
    invoke-virtual {p0, p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/awt/Window;)V

    .line 21
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->show()V

    return-void
.end method


# virtual methods
.method public getText()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->b:Ljavax/swing/JTextField;

    invoke-virtual {v0}, Ljavax/swing/JTextField;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
