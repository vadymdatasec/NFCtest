.class public Lorg/apache/log4j/pattern/NameAbbreviator$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/pattern/NameAbbreviator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:I

.field public final b:C


# direct methods
.method public constructor <init>(IC)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a:I

    .line 3
    iput-char p2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->b:C

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/StringBuffer;I)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    sub-int v1, v0, p2

    .line 2
    iget v2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a:I

    if-le v1, v2, :cond_0

    add-int/2addr v2, p2

    .line 3
    invoke-virtual {p1, v2, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 4
    iget v0, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a:I

    add-int/2addr v0, p2

    .line 5
    iget-char p2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->b:C

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p1, v0, p2}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    :cond_1
    return v0
.end method
