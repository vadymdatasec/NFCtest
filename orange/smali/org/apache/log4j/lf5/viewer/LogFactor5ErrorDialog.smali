.class public Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;
.super Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljavax/swing/JFrame;Ljava/lang/String;)V
    .locals 2

    const-string v0, "Error"

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Z)V

    .line 2
    new-instance p1, Ljavax/swing/JButton;

    const-string v0, "Ok"

    invoke-direct {p1, v0}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance v0, Lm/a/b/j/b/g0;

    invoke-direct {v0, p0}, Lm/a/b/j/b/g0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;)V

    invoke-virtual {p1, v0}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V

    .line 4
    new-instance v0, Ljavax/swing/JPanel;

    invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V

    .line 5
    new-instance v1, Ljava/awt/FlowLayout;

    invoke-direct {v1}, Ljava/awt/FlowLayout;-><init>()V

    invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V

    .line 6
    invoke-virtual {v0, p1}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;

    .line 7
    new-instance p1, Ljavax/swing/JPanel;

    invoke-direct {p1}, Ljavax/swing/JPanel;-><init>()V

    .line 8
    new-instance v1, Ljava/awt/GridBagLayout;

    invoke-direct {v1}, Ljava/awt/GridBagLayout;-><init>()V

    invoke-virtual {p1, v1}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V

    .line 9
    invoke-virtual {p0, p2, p1}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/lang/String;Ljava/awt/Container;)V

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;->getContentPane()Ljava/awt/Container;

    move-result-object p2

    const-string v1, "Center"

    invoke-virtual {p2, p1, v1}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;->getContentPane()Ljava/awt/Container;

    move-result-object p1

    const-string p2, "South"

    invoke-virtual {p1, v0, p2}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->show()V

    return-void
.end method
