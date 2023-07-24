.class public Lm/a/b/j/b/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/a/b/j/b/l;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    iput p2, p0, Lm/a/b/j/b/l;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 2
    iget-object v0, p0, Lm/a/b/j/b/l;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    iget v1, p0, Lm/a/b/j/b/l;->b:I

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(I)V

    .line 3
    iget-object v0, p0, Lm/a/b/j/b/l;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    iget-object v0, v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a:Ljavax/swing/JFrame;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljavax/swing/JFrame;->setVisible(Z)V

    return-void
.end method
