.class public Lorg/apache/log4j/lf5/util/LogFileParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ATTRIBUTE_DELIMITER:Ljava/lang/String; = "[slf5s."

.field public static final CATEGORY_DELIMITER:Ljava/lang/String; = "[slf5s.CATEGORY]"

.field public static final DATE_DELIMITER:Ljava/lang/String; = "[slf5s.DATE]"

.field public static final LOCATION_DELIMITER:Ljava/lang/String; = "[slf5s.LOCATION]"

.field public static final MESSAGE_DELIMITER:Ljava/lang/String; = "[slf5s.MESSAGE]"

.field public static final NDC_DELIMITER:Ljava/lang/String; = "[slf5s.NDC]"

.field public static final PRIORITY_DELIMITER:Ljava/lang/String; = "[slf5s.PRIORITY]"

.field public static final RECORD_DELIMITER:Ljava/lang/String; = "[slf5s.start]"

.field public static final THREAD_DELIMITER:Ljava/lang/String; = "[slf5s.THREAD]"

.field public static e:Ljava/text/SimpleDateFormat;


# instance fields
.field public b:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

.field public c:Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;

.field public d:Ljava/io/InputStream;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "dd MMM yyyy HH:mm:ss,S"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/util/LogFileParser;->e:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->d:Ljava/io/InputStream;

    .line 4
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->d:Ljava/io/InputStream;

    return-void
.end method

.method public static synthetic a(Lorg/apache/log4j/lf5/util/LogFileParser;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    add-int/lit8 v0, p1, -0x1

    const-string v1, "[slf5s."

    .line 24
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 25
    invoke-virtual {p2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "]"

    .line 26
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 27
    invoke-virtual {p2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 5
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->available()I

    move-result p1

    if-lez p1, :cond_0

    .line 6
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1, p1}, Ljava/lang/StringBuffer;-><init>(I)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    const/16 p1, 0x400

    invoke-direct {v1, p1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 8
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->read()I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_1

    int-to-char p1, p1

    .line 9
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 12
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecord;
    .locals 3

    if-eqz p1, :cond_1

    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lorg/apache/log4j/lf5/Log4JLogRecord;

    invoke-direct {v0}, Lorg/apache/log4j/lf5/Log4JLogRecord;-><init>()V

    .line 16
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->d(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/apache/log4j/lf5/LogRecord;->setMillis(J)V

    .line 17
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->h(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogLevel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setLevel(Lorg/apache/log4j/lf5/LogLevel;)V

    .line 18
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setCategory(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setLocation(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setThreadDescription(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setNDC(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setMessage(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/LogRecord;->setThrownStackTrace(Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a()V
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->c:Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;->hide()V

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->c:Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;->dispose()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;

    iget-object v1, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->b:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getBaseFrame()Ljavax/swing/JFrame;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "[slf5s.CATEGORY]"

    .line 1
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;)J
    .locals 3

    const-wide/16 v0, 0x0

    :try_start_0
    const-string v2, "[slf5s.DATE]"

    .line 1
    invoke-virtual {p0, v2, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-wide v0

    .line 2
    :cond_0
    sget-object v2, Lorg/apache/log4j/lf5/util/LogFileParser;->e:Ljava/text/SimpleDateFormat;

    invoke-virtual {v2, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-wide v0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "[slf5s.LOCATION]"

    .line 1
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "[slf5s.MESSAGE]"

    .line 1
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "[slf5s.NDC]"

    .line 1
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogLevel;
    .locals 1

    const-string v0, "[slf5s.PRIORITY]"

    .line 1
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    invoke-static {p1}, Lorg/apache/log4j/lf5/LogLevel;->valueOf(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogLevel;

    move-result-object p1
    :try_end_0
    .catch Lorg/apache/log4j/lf5/LogLevelFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 3
    :catch_0
    sget-object p1, Lorg/apache/log4j/lf5/LogLevel;->DEBUG:Lorg/apache/log4j/lf5/LogLevel;

    return-object p1

    .line 4
    :cond_0
    sget-object p1, Lorg/apache/log4j/lf5/LogLevel;->DEBUG:Lorg/apache/log4j/lf5/LogLevel;

    return-object p1
.end method

.method public final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "[slf5s.THREAD]"

    .line 1
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public parse(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->b:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    .line 2
    new-instance p1, Ljava/lang/Thread;

    invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;

    iget-object v1, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->b:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getBaseFrame()Ljavax/swing/JFrame;

    move-result-object v1

    const-string v2, "Loading file..."

    invoke-direct {v0, v1, v2}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->c:Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->d:Ljava/io/InputStream;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const-string v3, "[slf5s.start]"

    .line 3
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 4
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecord;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 5
    iget-object v4, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->b:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    invoke-virtual {v4, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V

    :cond_0
    add-int/lit8 v1, v3, 0xd

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecord;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v1, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->b:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    invoke-virtual {v1, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 9
    new-instance v0, Lm/a/b/j/a/a;

    invoke-direct {v0, p0}, Lm/a/b/j/a/a;-><init>(Lorg/apache/log4j/lf5/util/LogFileParser;)V

    invoke-static {v0}, Ljavax/swing/SwingUtilities;->invokeLater(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 10
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid log file format"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a()V

    const-string v0, "Error - Unable to load log file!"

    .line 12
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 13
    :catch_1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a()V

    const-string v0, "Error - Invalid log file format.\nPlease see documentation on how to load log files."

    .line 14
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->b(Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/LogFileParser;->d:Ljava/io/InputStream;

    return-void
.end method
