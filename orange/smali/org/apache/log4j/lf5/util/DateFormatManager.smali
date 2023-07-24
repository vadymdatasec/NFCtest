.class public Lorg/apache/log4j/lf5/util/DateFormatManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/TimeZone;

.field public b:Ljava/util/Locale;

.field public c:Ljava/lang/String;

.field public d:Ljava/text/DateFormat;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 4
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 6
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 23
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 24
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 25
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 26
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 27
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 16
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 17
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 18
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 19
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 20
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;Ljava/lang/String;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 46
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 47
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 48
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 49
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 50
    iput-object p2, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 51
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 9
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 10
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 11
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 12
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 13
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;Ljava/lang/String;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 38
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 39
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 40
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 41
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 42
    iput-object p2, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 43
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;Ljava/util/Locale;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 30
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 31
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 33
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 34
    iput-object p2, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 35
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;Ljava/util/Locale;Ljava/lang/String;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 54
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 55
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 56
    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 57
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 58
    iput-object p2, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 59
    iput-object p3, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 60
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->getLocale()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v1, v0}, Ljava/text/SimpleDateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;

    check-cast v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->applyPattern(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public format(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->getDateFormatInstance()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->getDateFormatInstance()Ljava/text/DateFormat;

    move-result-object v0

    .line 3
    instance-of v1, v0, Ljava/text/SimpleDateFormat;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/text/DateFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 5
    invoke-virtual {v0, p2}, Ljava/text/SimpleDateFormat;->applyPattern(Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized getDateFormatInstance()Ljava/text/DateFormat;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getLocale()Ljava/util/Locale;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getOutputFormat()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getPattern()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getTimeZone()Ljava/util/TimeZone;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public parse(Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->getDateFormatInstance()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public parse(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->getDateFormatInstance()Ljava/text/DateFormat;

    move-result-object v0

    .line 3
    instance-of v1, v0, Ljava/text/SimpleDateFormat;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/text/DateFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 5
    invoke-virtual {v0, p2}, Ljava/text/SimpleDateFormat;->applyPattern(Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized setDateFormatInstance(Ljava/text/DateFormat;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->d:Ljava/text/DateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setLocale(Ljava/util/Locale;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->b:Ljava/util/Locale;

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setOutputFormat(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setPattern(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->c:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setTimeZone(Ljava/util/TimeZone;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lorg/apache/log4j/lf5/util/DateFormatManager;->a:Ljava/util/TimeZone;

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/DateFormatManager;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
