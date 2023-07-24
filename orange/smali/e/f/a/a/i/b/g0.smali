.class public abstract Le/f/a/a/i/b/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Le/f/a/a/i/b/g0;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/a/a/i/b/g0;->a(Ljava/lang/Integer;)Le/f/a/a/i/b/g0;

    return-object p0
.end method

.method public abstract a(J)Le/f/a/a/i/b/g0;
.end method

.method public abstract a(Le/f/a/a/i/b/d0;)Le/f/a/a/i/b/g0;
.end method

.method public abstract a(Le/f/a/a/i/b/n0;)Le/f/a/a/i/b/g0;
.end method

.method public abstract a(Ljava/lang/Integer;)Le/f/a/a/i/b/g0;
.end method

.method public abstract a(Ljava/lang/String;)Le/f/a/a/i/b/g0;
.end method

.method public abstract a(Ljava/util/List;)Le/f/a/a/i/b/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/f/a/a/i/b/f0;",
            ">;)",
            "Le/f/a/a/i/b/g0;"
        }
    .end annotation
.end method

.method public abstract a()Le/f/a/a/i/b/h0;
.end method

.method public abstract b(J)Le/f/a/a/i/b/g0;
.end method

.method public b(Ljava/lang/String;)Le/f/a/a/i/b/g0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/a/a/i/b/g0;->a(Ljava/lang/String;)Le/f/a/a/i/b/g0;

    return-object p0
.end method
