.class public Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;
.super Ljava/text/DateFormat;
.source "SourceFile"


# static fields
.field public static final ABS_TIME_DATE_FORMAT:Ljava/lang/String; = "ABSOLUTE"

.field public static final DATE_AND_TIME_DATE_FORMAT:Ljava/lang/String; = "DATE"

.field public static final ISO8601_DATE_FORMAT:Ljava/lang/String; = "ISO8601"

.field public static b:J

.field public static c:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [C

    .line 1
    sput-object v0, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->c:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->setCalendar(Ljava/util/Calendar;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V

    .line 4
    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->setCalendar(Ljava/util/Calendar;)V

    return-void
.end method


# virtual methods
.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    .line 2
    rem-long v2, v0, v2

    long-to-int p3, v2

    int-to-long v2, p3

    sub-long/2addr v0, v2

    .line 3
    sget-wide v2, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->b:J

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/16 v6, 0x30

    cmp-long v7, v0, v2

    if-nez v7, :cond_1

    sget-object v2, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->c:[C

    aget-char v3, v2, v4

    if-nez v3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object v2, p0, Ljava/text/DateFormat;->calendar:Ljava/util/Calendar;

    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 6
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I

    move-result p1

    .line 7
    iget-object v2, p0, Ljava/text/DateFormat;->calendar:Ljava/util/Calendar;

    const/16 v3, 0xb

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ge v2, v5, :cond_2

    .line 8
    invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 9
    :cond_2
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const/16 v2, 0x3a

    .line 10
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 11
    iget-object v3, p0, Ljava/text/DateFormat;->calendar:Ljava/util/Calendar;

    const/16 v7, 0xc

    invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ge v3, v5, :cond_3

    .line 12
    invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 13
    :cond_3
    invoke-virtual {p2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 14
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 15
    iget-object v2, p0, Ljava/text/DateFormat;->calendar:Ljava/util/Calendar;

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ge v2, v5, :cond_4

    .line 16
    invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 17
    :cond_4
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const/16 v2, 0x2c

    .line 18
    invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 19
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    sget-object v3, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->c:[C

    invoke-virtual {p2, p1, v2, v3, v4}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    .line 20
    sput-wide v0, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->b:J

    :goto_1
    const/16 p1, 0x64

    if-ge p3, p1, :cond_5

    .line 21
    invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_5
    if-ge p3, v5, :cond_6

    .line 22
    invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 23
    :cond_6
    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    return-object p2
.end method

.method public parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
