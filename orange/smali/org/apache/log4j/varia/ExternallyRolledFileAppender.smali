.class public Lorg/apache/log4j/varia/ExternallyRolledFileAppender;
.super Lorg/apache/log4j/RollingFileAppender;
.source "SourceFile"


# static fields
.field public static final OK:Ljava/lang/String; = "OK"

.field public static final ROLL_OVER:Ljava/lang/String; = "RollOver"


# instance fields
.field public r:I

.field public s:Lm/a/b/m/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/RollingFileAppender;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I

    return-void
.end method


# virtual methods
.method public activateOptions()V
    .locals 2

    .line 1
    invoke-super {p0}, Lorg/apache/log4j/FileAppender;->activateOptions()V

    .line 2
    iget v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->s:Lm/a/b/m/a;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 5
    :cond_0
    new-instance v0, Lm/a/b/m/a;

    iget v1, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I

    invoke-direct {v0, p0, v1}, Lm/a/b/m/a;-><init>(Lorg/apache/log4j/varia/ExternallyRolledFileAppender;I)V

    iput-object v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->s:Lm/a/b/m/a;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 7
    iget-object v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->s:Lm/a/b/m/a;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_1
    return-void
.end method

.method public getPort()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I

    return v0
.end method

.method public setPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I

    return-void
.end method
