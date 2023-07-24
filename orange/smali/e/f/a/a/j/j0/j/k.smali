.class public abstract Le/f/a/a/j/j0/j/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Le/f/a/a/j/j0/j/j;
    .locals 2

    .line 1
    new-instance v0, Le/f/a/a/j/j0/j/e;

    invoke-direct {v0}, Le/f/a/a/j/j0/j/e;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/a/j/j0/j/e;->a(Ljava/util/Set;)Le/f/a/a/j/j0/j/j;

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Le/f/a/a/j/j0/j/l;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()J
.end method
