.class public Lorg/apache/log4j/Level;
.super Lorg/apache/log4j/Priority;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ALL:Lorg/apache/log4j/Level;

.field public static final DEBUG:Lorg/apache/log4j/Level;

.field public static final ERROR:Lorg/apache/log4j/Level;

.field public static final FATAL:Lorg/apache/log4j/Level;

.field public static final INFO:Lorg/apache/log4j/Level;

.field public static final OFF:Lorg/apache/log4j/Level;

.field public static final TRACE:Lorg/apache/log4j/Level;

.field public static final TRACE_INT:I = 0x1388

.field public static final WARN:Lorg/apache/log4j/Level;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/log4j/Level;

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-string v3, "OFF"

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->OFF:Lorg/apache/log4j/Level;

    .line 2
    new-instance v0, Lorg/apache/log4j/Level;

    const v2, 0xc350

    const-string v3, "FATAL"

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    .line 3
    new-instance v0, Lorg/apache/log4j/Level;

    const v1, 0x9c40

    const-string v2, "ERROR"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    .line 4
    new-instance v0, Lorg/apache/log4j/Level;

    const/16 v1, 0x7530

    const-string v2, "WARN"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    .line 5
    new-instance v0, Lorg/apache/log4j/Level;

    const/16 v1, 0x4e20

    const-string v2, "INFO"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    .line 6
    new-instance v0, Lorg/apache/log4j/Level;

    const/4 v1, 0x7

    const/16 v2, 0x2710

    const-string v3, "DEBUG"

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    .line 7
    new-instance v0, Lorg/apache/log4j/Level;

    const/16 v2, 0x1388

    const-string v3, "TRACE"

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    .line 8
    new-instance v0, Lorg/apache/log4j/Level;

    const/high16 v2, -0x80000000

    const-string v3, "ALL"

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V

    sput-object v0, Lorg/apache/log4j/Level;->ALL:Lorg/apache/log4j/Level;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/log4j/Priority;-><init>(ILjava/lang/String;I)V

    return-void
.end method

.method public static toLevel(I)Lorg/apache/log4j/Level;
    .locals 1

    .line 2
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p0, v0}, Lorg/apache/log4j/Level;->toLevel(ILorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p0

    return-object p0
.end method

.method public static toLevel(ILorg/apache/log4j/Level;)Lorg/apache/log4j/Level;
    .locals 1

    const/high16 v0, -0x80000000

    if-eq p0, v0, :cond_7

    const/16 v0, 0x1388

    if-eq p0, v0, :cond_6

    const/16 v0, 0x2710

    if-eq p0, v0, :cond_5

    const/16 v0, 0x4e20

    if-eq p0, v0, :cond_4

    const/16 v0, 0x7530

    if-eq p0, v0, :cond_3

    const v0, 0x9c40

    if-eq p0, v0, :cond_2

    const v0, 0xc350

    if-eq p0, v0, :cond_1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    return-object p1

    .line 3
    :cond_0
    sget-object p0, Lorg/apache/log4j/Level;->OFF:Lorg/apache/log4j/Level;

    return-object p0

    .line 4
    :cond_1
    sget-object p0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    return-object p0

    .line 5
    :cond_2
    sget-object p0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    return-object p0

    .line 6
    :cond_3
    sget-object p0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    return-object p0

    .line 7
    :cond_4
    sget-object p0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    return-object p0

    .line 8
    :cond_5
    sget-object p0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    return-object p0

    .line 9
    :cond_6
    sget-object p0, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    return-object p0

    .line 10
    :cond_7
    sget-object p0, Lorg/apache/log4j/Level;->ALL:Lorg/apache/log4j/Level;

    return-object p0
.end method

.method public static toLevel(Ljava/lang/String;)Lorg/apache/log4j/Level;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p0, v0}, Lorg/apache/log4j/Level;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p0

    return-object p0
.end method

.method public static toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;
    .locals 1

    if-nez p0, :cond_0

    return-object p1

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ALL"

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lorg/apache/log4j/Level;->ALL:Lorg/apache/log4j/Level;

    return-object p0

    :cond_1
    const-string v0, "DEBUG"

    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    return-object p0

    :cond_2
    const-string v0, "INFO"

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    return-object p0

    :cond_3
    const-string v0, "WARN"

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    return-object p0

    :cond_4
    const-string v0, "ERROR"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    return-object p0

    :cond_5
    const-string v0, "FATAL"

    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    return-object p0

    :cond_6
    const-string v0, "OFF"

    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lorg/apache/log4j/Level;->OFF:Lorg/apache/log4j/Level;

    return-object p0

    :cond_7
    const-string v0, "TRACE"

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    return-object p0

    :cond_8
    const-string v0, "\u0130NFO"

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    sget-object p0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    return-object p0

    :cond_9
    return-object p1
.end method
