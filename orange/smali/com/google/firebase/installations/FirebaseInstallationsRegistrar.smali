.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
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

.method public static synthetic lambda$getComponents$0(Le/f/c/k/f;)Le/f/c/s/k;
    .locals 4

    .line 1
    new-instance v0, Le/f/c/s/j;

    const-class v1, Le/f/c/h;

    .line 2
    invoke-interface {p0, v1}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/h;

    const-class v2, Le/f/c/v/h;

    .line 3
    invoke-interface {p0, v2}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/c/v/h;

    const-class v3, Le/f/c/p/d;

    .line 4
    invoke-interface {p0, v3}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/f/c/p/d;

    invoke-direct {v0, v1, v2, p0}, Le/f/c/s/j;-><init>(Le/f/c/h;Le/f/c/v/h;Le/f/c/p/d;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/f/c/k/e<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Le/f/c/k/e;

    .line 1
    const-class v1, Le/f/c/s/k;

    .line 2
    invoke-static {v1}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v1

    const-class v2, Le/f/c/h;

    .line 3
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/p/d;

    .line 4
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/v/h;

    .line 5
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    invoke-static {}, Le/f/c/s/l;->a()Le/f/c/k/k;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 7
    invoke-virtual {v1}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-installations"

    const-string v2, "16.3.3"

    .line 8
    invoke-static {v1, v2}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 9
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
