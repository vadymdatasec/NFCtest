.class public final Lorg/apache/log4j/LogSF;
.super Lorg/apache/log4j/LogXF;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String;

.field public static synthetic e:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/LogSF;->e:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.LogSF"

    invoke-static {v0}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/LogSF;->e:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/LogSF;->d:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 19
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_1

    const-string v0, "\\{"

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    .line 13
    invoke-static {p0, v0}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "{}"

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 15
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    .line 16
    :try_start_0
    invoke-static {p0}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;)Ljava/util/ResourceBundle;

    move-result-object p0

    .line 17
    invoke-virtual {p0, p1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    :cond_0
    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    if-eqz p0, :cond_5

    const-string v0, "{"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    const-string v3, ""

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    if-ltz v1, :cond_4

    if-eqz v1, :cond_1

    add-int/lit8 v5, v1, -0x1

    .line 2
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x5c

    if-eq v6, v7, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    move-object v4, v2

    :goto_1
    move v2, v1

    goto :goto_4

    .line 4
    :cond_1
    :goto_2
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v4, v1, 0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_3

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_3

    if-eqz p1, :cond_2

    .line 6
    array-length v4, p1

    if-ge v3, v4, :cond_2

    .line 7
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v3, 0x1

    aget-object v3, p1, v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 8
    :cond_2
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "{}"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    move v8, v3

    move-object v3, v2

    move v2, v8

    :goto_3
    add-int/lit8 v1, v1, 0x2

    move-object v4, v3

    move v3, v2

    goto :goto_1

    .line 9
    :cond_3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move v2, v4

    move-object v4, v1

    .line 10
    :goto_4
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    goto/16 :goto_0

    .line 11
    :cond_4
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V
    .locals 7

    .line 20
    new-instance v6, Lorg/apache/log4j/spi/LoggingEvent;

    sget-object v1, Lorg/apache/log4j/LogSF;->d:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v6}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V

    return-void
.end method

.method public static a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 7

    .line 21
    new-instance v6, Lorg/apache/log4j/spi/LoggingEvent;

    sget-object v1, Lorg/apache/log4j/LogSF;->d:Ljava/lang/String;

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v6}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V

    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;B)V
    .locals 1

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;C)V
    .locals 1

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(C)Ljava/lang/Character;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;D)V
    .locals 1

    .line 19
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;F)V
    .locals 1

    .line 17
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;I)V
    .locals 1

    .line 13
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;J)V
    .locals 1

    .line 15
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 21
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 23
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 25
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4, p5}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;S)V
    .locals 1

    .line 11
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;Z)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static debug(Lorg/apache/log4j/Logger;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v0, p2, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static error(Lorg/apache/log4j/Logger;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static error(Lorg/apache/log4j/Logger;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    sget-object v0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lorg/apache/log4j/Level;->ERROR:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v0, p2, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static fatal(Lorg/apache/log4j/Logger;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static fatal(Lorg/apache/log4j/Logger;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    sget-object v0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lorg/apache/log4j/Level;->FATAL:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v0, p2, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;B)V
    .locals 1

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;C)V
    .locals 1

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(C)Ljava/lang/Character;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;D)V
    .locals 1

    .line 19
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;F)V
    .locals 1

    .line 17
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;I)V
    .locals 1

    .line 13
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;J)V
    .locals 1

    .line 15
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 21
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 23
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 25
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4, p5}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;S)V
    .locals 1

    .line 11
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;Z)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static info(Lorg/apache/log4j/Logger;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/Category;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lorg/apache/log4j/Level;->INFO:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v0, p2, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;B)V
    .locals 1

    .line 9
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(B)Ljava/lang/Byte;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;C)V
    .locals 1

    .line 11
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(C)Ljava/lang/Character;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;D)V
    .locals 1

    .line 21
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-static {p3, p4}, Lorg/apache/log4j/LogXF;->a(D)Ljava/lang/Double;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;F)V
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(F)Ljava/lang/Float;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;I)V
    .locals 1

    .line 15
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;J)V
    .locals 1

    .line 17
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-static {p3, p4}, Lorg/apache/log4j/LogXF;->a(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 5
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 23
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-static {p3, p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    invoke-static {p3, p4, p5}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-static {p3, p4, p5, p6}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;S)V
    .locals 1

    .line 13
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(S)Ljava/lang/Short;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Z)V
    .locals 1

    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static log(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p0, p1, p3, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;B)V
    .locals 1

    .line 11
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(B)Ljava/lang/Byte;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;C)V
    .locals 1

    .line 9
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(C)Ljava/lang/Character;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;D)V
    .locals 1

    .line 21
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-static {p4, p5}, Lorg/apache/log4j/LogXF;->a(D)Ljava/lang/Double;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;F)V
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(F)Ljava/lang/Float;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 15
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 17
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-static {p4, p5}, Lorg/apache/log4j/LogXF;->a(J)Ljava/lang/Long;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 5
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 23
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-static {p4, p5}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    invoke-static {p4, p5, p6}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-static {p4, p5, p6, p7}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;S)V
    .locals 1

    .line 13
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(S)Ljava/lang/Short;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-static {p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static logrb(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p3, p4, p5}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p0, p1, p3, p2}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;B)V
    .locals 1

    .line 9
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;C)V
    .locals 1

    .line 7
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(C)Ljava/lang/Character;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;D)V
    .locals 1

    .line 19
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;F)V
    .locals 1

    .line 17
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;I)V
    .locals 1

    .line 13
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;J)V
    .locals 1

    .line 15
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 21
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 23
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 25
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 27
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4, p5}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;S)V
    .locals 1

    .line 11
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;Z)V
    .locals 1

    .line 5
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static trace(Lorg/apache/log4j/Logger;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lorg/apache/log4j/LogXF;->a:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v0, p2, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;B)V
    .locals 1

    .line 9
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;C)V
    .locals 1

    .line 7
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(C)Ljava/lang/Character;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;D)V
    .locals 1

    .line 19
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;F)V
    .locals 1

    .line 17
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;I)V
    .locals 1

    .line 13
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;J)V
    .locals 1

    .line 15
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 21
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 23
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 25
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 27
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2, p3, p4, p5}, Lorg/apache/log4j/LogXF;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;S)V
    .locals 1

    .line 11
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;Z)V
    .locals 1

    .line 5
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2}, Lorg/apache/log4j/LogXF;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p1, p2}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static warn(Lorg/apache/log4j/Logger;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 3
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->isEnabledFor(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lorg/apache/log4j/Level;->WARN:Lorg/apache/log4j/Level;

    invoke-static {p2, p3}, Lorg/apache/log4j/LogSF;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v0, p2, p1}, Lorg/apache/log4j/LogSF;->a(Lorg/apache/log4j/Logger;Lorg/apache/log4j/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
