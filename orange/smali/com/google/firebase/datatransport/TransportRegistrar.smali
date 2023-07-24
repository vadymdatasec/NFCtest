.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/l;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$getComponents$0(Le/f/c/k/f;)Le/f/a/a/g;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Le/f/a/a/j/c0;->a(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Le/f/a/a/j/c0;->b()Le/f/a/a/j/c0;

    move-result-object p0

    sget-object v0, Le/f/a/a/i/a;->g:Le/f/a/a/i/a;

    invoke-virtual {p0, v0}, Le/f/a/a/j/c0;->a(Le/f/a/a/j/m;)Le/f/a/a/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/f/c/k/e<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Le/f/a/a/g;

    .line 2
    invoke-static {v0}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    .line 3
    invoke-static {v1}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    invoke-static {}, Le/f/c/m/a;->a()Le/f/c/k/k;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 5
    invoke-virtual {v0}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v0

    .line 6
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
