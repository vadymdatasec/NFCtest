.class public Lorg/apache/log4j/pattern/NameAbbreviator$b;
.super Lorg/apache/log4j/pattern/NameAbbreviator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/pattern/NameAbbreviator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/pattern/NameAbbreviator;-><init>()V

    .line 2
    iput p1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$b;->b:I

    return-void
.end method


# virtual methods
.method public abbreviate(ILjava/lang/StringBuffer;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 2
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    iget v2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$b;->b:I

    :goto_0
    if-lez v2, :cond_2

    add-int/lit8 v0, v0, -0x1

    const-string v3, "."

    .line 4
    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    if-ge v0, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 5
    invoke-virtual {p2, p1, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    return-void
.end method
