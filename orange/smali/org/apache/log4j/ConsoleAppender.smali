.class public Lorg/apache/log4j/ConsoleAppender;
.super Lorg/apache/log4j/WriterAppender;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/ConsoleAppender$b;,
        Lorg/apache/log4j/ConsoleAppender$a;
    }
.end annotation


# static fields
.field public static final SYSTEM_ERR:Ljava/lang/String; = "System.err"

.field public static final SYSTEM_OUT:Ljava/lang/String; = "System.out"


# instance fields
.field public k:Ljava/lang/String;

.field public l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V

    const-string v0, "System.out"

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Layout;)V
    .locals 1

    const-string v0, "System.out"

    .line 4
    invoke-direct {p0, p1, v0}, Lorg/apache/log4j/ConsoleAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Layout;Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V

    const-string v0, "System.out"

    .line 6
    iput-object v0, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z

    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/log4j/AppenderSkeleton;->setLayout(Lorg/apache/log4j/Layout;)V

    .line 9
    invoke-virtual {p0, p2}, Lorg/apache/log4j/ConsoleAppender;->setTarget(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/ConsoleAppender;->activateOptions()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "] should be System.out or System.err."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const-string p1, "Using previously set target, System.out by default."

    .line 2
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public activateOptions()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z

    const-string v1, "System.err"

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lorg/apache/log4j/ConsoleAppender$a;

    invoke-direct {v0}, Lorg/apache/log4j/ConsoleAppender$a;-><init>()V

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lorg/apache/log4j/ConsoleAppender$b;

    invoke-direct {v0}, Lorg/apache/log4j/ConsoleAppender$b;-><init>()V

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V

    goto :goto_0

    .line 7
    :cond_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V

    .line 8
    :goto_0
    invoke-super {p0}, Lorg/apache/log4j/WriterAppender;->activateOptions()V

    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0}, Lorg/apache/log4j/WriterAppender;->b()V

    :cond_0
    return-void
.end method

.method public final getFollow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z

    return v0
.end method

.method public getTarget()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final setFollow(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z

    return-void
.end method

.method public setTarget(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "System.out"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iput-object v1, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, "System.err"

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iput-object v1, p0, Lorg/apache/log4j/ConsoleAppender;->k:Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/ConsoleAppender;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
