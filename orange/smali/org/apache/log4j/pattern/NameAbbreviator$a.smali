.class public Lorg/apache/log4j/pattern/NameAbbreviator$a;
.super Lorg/apache/log4j/pattern/NameAbbreviator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/pattern/NameAbbreviator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/pattern/NameAbbreviator;-><init>()V

    .line 2
    iput p1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$a;->b:I

    return-void
.end method


# virtual methods
.method public abbreviate(ILjava/lang/StringBuffer;)V
    .locals 4

    .line 1
    iget v0, p0, Lorg/apache/log4j/pattern/NameAbbreviator$a;->b:I

    const-string v1, "."

    .line 2
    invoke-virtual {p2, v1, p1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    move-result v2

    :goto_0
    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    add-int/2addr v0, v3

    if-nez v0, :cond_0

    add-int/lit8 v2, v2, 0x1

    .line 3
    invoke-virtual {p2, p1, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 4
    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    move-result v2

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
