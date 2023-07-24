.class public abstract Lorg/apache/log4j/lf5/LogRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static l:J


# instance fields
.field public b:Lorg/apache/log4j/lf5/LogLevel;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/Throwable;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/log4j/lf5/LogRecord;->e:J

    const-string v0, "Debug"

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->f:Ljava/lang/String;

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->c:Ljava/lang/String;

    .line 5
    sget-object v1, Lorg/apache/log4j/lf5/LogLevel;->INFO:Lorg/apache/log4j/lf5/LogLevel;

    iput-object v1, p0, Lorg/apache/log4j/lf5/LogRecord;->b:Lorg/apache/log4j/lf5/LogLevel;

    .line 6
    invoke-static {}, Lorg/apache/log4j/lf5/LogRecord;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lorg/apache/log4j/lf5/LogRecord;->d:J

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/log4j/lf5/LogRecord;->g:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->j:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->k:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized a()J
    .locals 5

    const-class v0, Lorg/apache/log4j/lf5/LogRecord;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-wide v1, Lorg/apache/log4j/lf5/LogRecord;->l:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    sput-wide v1, Lorg/apache/log4j/lf5/LogRecord;->l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized resetSequenceNumber()V
    .locals 3

    const-class v0, Lorg/apache/log4j/lf5/LogRecord;

    monitor-enter v0

    const-wide/16 v1, 0x0

    .line 1
    :try_start_0
    sput-wide v1, Lorg/apache/log4j/lf5/LogRecord;->l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public getCategory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getLevel()Lorg/apache/log4j/lf5/LogLevel;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->b:Lorg/apache/log4j/lf5/LogLevel;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/lf5/LogRecord;->e:J

    return-wide v0
.end method

.method public getNDC()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getSequenceNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/lf5/LogRecord;->d:J

    return-wide v0
.end method

.method public getThreadDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getThrown()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->i:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getThrownStackTrace()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/LogRecord;->h:Ljava/lang/String;

    return-object v0
.end method

.method public hasThrown()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->getThrown()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isFatal()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->isSevereLevel()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->hasThrown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public abstract isSevereLevel()Z
.end method

.method public setCategory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->f:Ljava/lang/String;

    return-void
.end method

.method public setLevel(Lorg/apache/log4j/lf5/LogLevel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->b:Lorg/apache/log4j/lf5/LogLevel;

    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->k:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->c:Ljava/lang/String;

    return-void
.end method

.method public setMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/log4j/lf5/LogRecord;->e:J

    return-void
.end method

.method public setNDC(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->j:Ljava/lang/String;

    return-void
.end method

.method public setSequenceNumber(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/log4j/lf5/LogRecord;->d:J

    return-void
.end method

.method public setThreadDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->g:Ljava/lang/String;

    return-void
.end method

.method public setThrown(Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->i:Ljava/lang/Throwable;

    .line 2
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 3
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 5
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 6
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->h:Ljava/lang/String;

    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 8
    invoke-virtual {v0}, Ljava/io/StringWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public setThrownStackTrace(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/LogRecord;->h:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "LogRecord: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/lf5/LogRecord;->b:Lorg/apache/log4j/lf5/LogLevel;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/lf5/LogRecord;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
