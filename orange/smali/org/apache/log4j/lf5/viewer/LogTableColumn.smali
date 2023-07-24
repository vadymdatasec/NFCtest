.class public Lorg/apache/log4j/lf5/viewer/LogTableColumn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final CATEGORY:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final DATE:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final LEVEL:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final LOCATION:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final MESSAGE:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final MESSAGE_NUM:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final NDC:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final THREAD:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static final THROWN:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static c:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public static d:Ljava/util/Map;


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Date"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->DATE:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 2
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Thread"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->THREAD:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 3
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Message #"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->MESSAGE_NUM:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 4
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Level"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->LEVEL:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 5
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "NDC"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->NDC:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 6
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Category"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->CATEGORY:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 7
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Message"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->MESSAGE:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 8
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Location"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->LOCATION:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 9
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const-string v1, "Thrown"

    invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->THROWN:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/16 v1, 0x9

    new-array v1, v1, [Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 10
    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->DATE:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->THREAD:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->MESSAGE_NUM:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x2

    aput-object v2, v1, v4

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->LEVEL:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x3

    aput-object v2, v1, v4

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->NDC:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x4

    aput-object v2, v1, v4

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->CATEGORY:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x5

    aput-object v2, v1, v4

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->MESSAGE:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x6

    aput-object v2, v1, v4

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->LOCATION:Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 v4, 0x7

    aput-object v2, v1, v4

    const/16 v2, 0x8

    aput-object v0, v1, v2

    sput-object v1, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->c:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->d:Ljava/util/Map;

    .line 12
    :goto_0
    sget-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->c:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    array-length v1, v0

    if-ge v3, v1, :cond_0

    .line 13
    sget-object v1, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->d:Ljava/util/Map;

    aget-object v0, v0, v3

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->c:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->b:Ljava/lang/String;

    return-void
.end method

.method public static getLogTableColumnArray()[Lorg/apache/log4j/lf5/viewer/LogTableColumn;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->c:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    return-object v0
.end method

.method public static getLogTableColumns()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->c:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/log4j/lf5/viewer/LogTableColumn;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException;
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Error while trying to parse ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, ") into"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, " a LogTableColumn."

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 6
    new-instance p0, Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->b:Ljava/lang/String;

    return-object v0
.end method
