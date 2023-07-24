.class public abstract Lorg/apache/log4j/helpers/DateLayout;
.super Lorg/apache/log4j/Layout;
.source "SourceFile"


# static fields
.field public static final DATE_FORMAT_OPTION:Ljava/lang/String; = "DateFormat"

.field public static final NULL_DATE_FORMAT:Ljava/lang/String; = "NULL"

.field public static final RELATIVE_TIME_DATE_FORMAT:Ljava/lang/String; = "RELATIVE"

.field public static final TIMEZONE_OPTION:Ljava/lang/String; = "TimeZone"


# instance fields
.field public a:Ljava/text/FieldPosition;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/text/DateFormat;

.field public e:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V

    .line 2
    new-instance v0, Ljava/text/FieldPosition;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/text/FieldPosition;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->a:Ljava/text/FieldPosition;

    .line 3
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->e:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public activateOptions()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    return-void
.end method

.method public dateFormat(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->e:Ljava/util/Date;

    iget-wide v1, p2, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    invoke-virtual {v0, v1, v2}, Ljava/util/Date;->setTime(J)V

    .line 3
    iget-object p2, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->e:Ljava/util/Date;

    iget-object v1, p0, Lorg/apache/log4j/helpers/DateLayout;->a:Ljava/text/FieldPosition;

    invoke-virtual {p2, v0, p1, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;

    const/16 p2, 0x20

    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_0
    return-void
.end method

.method public getDateFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getOptionStrings()[Ljava/lang/String;
    .locals 2

    const-string v0, "DateFormat"

    const-string v1, "TimeZone"

    .line 1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setDateFormat(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->c:Ljava/lang/String;

    .line 2
    :cond_0
    iget-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->c:Ljava/lang/String;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;Ljava/util/TimeZone;)V

    return-void
.end method

.method public setDateFormat(Ljava/lang/String;Ljava/util/TimeZone;)V
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 5
    iput-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    return-void

    :cond_0
    const-string v1, "NULL"

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    iput-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    goto :goto_0

    :cond_1
    const-string v0, "RELATIVE"

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    new-instance p1, Lorg/apache/log4j/helpers/RelativeTimeDateFormat;

    invoke-direct {p1}, Lorg/apache/log4j/helpers/RelativeTimeDateFormat;-><init>()V

    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    goto :goto_0

    :cond_2
    const-string v0, "ABSOLUTE"

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    new-instance p1, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;

    invoke-direct {p1, p2}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>(Ljava/util/TimeZone;)V

    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    goto :goto_0

    :cond_3
    const-string v0, "DATE"

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 13
    new-instance p1, Lorg/apache/log4j/helpers/DateTimeDateFormat;

    invoke-direct {p1, p2}, Lorg/apache/log4j/helpers/DateTimeDateFormat;-><init>(Ljava/util/TimeZone;)V

    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    goto :goto_0

    :cond_4
    const-string v0, "ISO8601"

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15
    new-instance p1, Lorg/apache/log4j/helpers/ISO8601DateFormat;

    invoke-direct {p1, p2}, Lorg/apache/log4j/helpers/ISO8601DateFormat;-><init>(Ljava/util/TimeZone;)V

    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    goto :goto_0

    .line 16
    :cond_5
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    .line 17
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :goto_0
    return-void
.end method

.method public setDateFormat(Ljava/text/DateFormat;Ljava/util/TimeZone;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->d:Ljava/text/DateFormat;

    .line 4
    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-void
.end method

.method public setOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "DateFormat"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, "TimeZone"

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iput-object p2, p0, Lorg/apache/log4j/helpers/DateLayout;->b:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/helpers/DateLayout;->b:Ljava/lang/String;

    return-void
.end method
