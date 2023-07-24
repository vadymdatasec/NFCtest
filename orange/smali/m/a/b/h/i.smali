.class public Lm/a/b/h/i;
.super Ljavax/swing/JPanel;
.source "SourceFile"

# interfaces
.implements Ljavax/swing/event/ListSelectionListener;


# static fields
.field public static synthetic b:Ljava/lang/Class;


# instance fields
.field public final a:Ljavax/swing/JEditorPane;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lm/a/b/h/i;->b:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.chainsaw.DetailPanel"

    invoke-static {v0}, Lm/a/b/h/i;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lm/a/b/h/i;->b:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    .line 2
    new-instance v0, Ljava/text/MessageFormat;

    const-string v1, "<b>Time:</b> <code>{0,time,medium}</code>&nbsp;&nbsp;<b>Priority:</b> <code>{1}</code>&nbsp;&nbsp;<b>Thread:</b> <code>{2}</code>&nbsp;&nbsp;<b>NDC:</b> <code>{3}</code><br><b>Logger:</b> <code>{4}</code><br><b>Location:</b> <code>{5}</code><br><b>Message:</b><pre>{6}</pre><b>Throwable:</b><pre>{7}</pre>"

    invoke-direct {v0, v1}, Ljava/text/MessageFormat;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljavax/swing/JTable;Lm/a/b/h/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljavax/swing/JPanel;-><init>()V

    .line 2
    new-instance p2, Ljava/awt/BorderLayout;

    invoke-direct {p2}, Ljava/awt/BorderLayout;-><init>()V

    invoke-virtual {p0, p2}, Lm/a/b/h/i;->setLayout(Ljava/awt/LayoutManager;)V

    const-string p2, "Details: "

    .line 3
    invoke-static {p2}, Ljavax/swing/BorderFactory;->createTitledBorder(Ljava/lang/String;)Ljavax/swing/border/TitledBorder;

    move-result-object p2

    invoke-virtual {p0, p2}, Lm/a/b/h/i;->setBorder(Ljavax/swing/border/Border;)V

    .line 4
    new-instance p2, Ljavax/swing/JEditorPane;

    invoke-direct {p2}, Ljavax/swing/JEditorPane;-><init>()V

    iput-object p2, p0, Lm/a/b/h/i;->a:Ljavax/swing/JEditorPane;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p2, v0}, Ljavax/swing/JEditorPane;->setEditable(Z)V

    .line 6
    iget-object p2, p0, Lm/a/b/h/i;->a:Ljavax/swing/JEditorPane;

    const-string v0, "text/html"

    invoke-virtual {p2, v0}, Ljavax/swing/JEditorPane;->setContentType(Ljava/lang/String;)V

    .line 7
    new-instance p2, Ljavax/swing/JScrollPane;

    iget-object v0, p0, Lm/a/b/h/i;->a:Ljavax/swing/JEditorPane;

    invoke-direct {p2, v0}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V

    const-string v0, "Center"

    invoke-virtual {p0, p2, v0}, Lm/a/b/h/i;->add(Ljava/awt/Component;Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p1}, Ljavax/swing/JTable;->getSelectionModel()Ljavax/swing/ListSelectionModel;

    move-result-object p1

    .line 9
    invoke-interface {p1, p0}, Ljavax/swing/ListSelectionModel;->addListSelectionListener(Ljavax/swing/event/ListSelectionListener;)V

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
