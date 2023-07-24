.class public abstract Lorg/apache/log4j/helpers/FileWatchdog;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final DEFAULT_DELAY:J = 0xea60L


# instance fields
.field public b:Ljava/lang/String;

.field public c:J

.field public d:Ljava/io/File;

.field public e:J

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "FileWatchdog"

    .line 1
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const-wide/32 v0, 0xea60

    .line 2
    iput-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->c:J

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->e:J

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z

    .line 5
    iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->g:Z

    .line 6
    iput-object p1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->b:Ljava/lang/String;

    .line 7
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->d:Ljava/io/File;

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/helpers/FileWatchdog;->a()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->d:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    .line 3
    iget-wide v2, p0, Lorg/apache/log4j/helpers/FileWatchdog;->e:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 4
    iput-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->e:J

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/helpers/FileWatchdog;->b()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z

    goto :goto_0

    .line 7
    :cond_0
    iget-boolean v1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z

    if-nez v1, :cond_1

    .line 8
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/helpers/FileWatchdog;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "] does not exist."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 9
    iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z

    :cond_1
    :goto_0
    return-void

    .line 10
    :catch_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Was not allowed to read check file existance, file:["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/helpers/FileWatchdog;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "]."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    .line 11
    iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->g:Z

    return-void
.end method

.method public abstract b()V
.end method

.method public run()V
    .locals 2

    .line 1
    :goto_0
    iget-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->g:Z

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->c:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :catch_0
    invoke-virtual {p0}, Lorg/apache/log4j/helpers/FileWatchdog;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setDelay(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->c:J

    return-void
.end method
