.class public Lm/b/j/d0;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lm/b/j/c0;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    iput p2, p0, Lm/b/j/d0;->b:I

    return-void
.end method

.method public static a(I)Lm/b/j/d0;
    .locals 2

    .line 2
    new-instance v0, Lm/b/j/d0;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0}, Lm/b/j/d0;-><init>(II)V

    return-object v0
.end method

.method public static b()Lm/b/j/d0;
    .locals 2

    .line 1
    new-instance v0, Lm/b/j/d0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lm/b/j/d0;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lm/b/j/d0;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
