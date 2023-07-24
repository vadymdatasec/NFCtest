.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/l;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic lambda$getComponents$0$Registrar(Le/f/c/k/f;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v1, Le/f/c/h;

    .line 2
    invoke-interface {p0, v1}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/h;

    const-class v2, Le/f/c/v/h;

    .line 3
    invoke-interface {p0, v2}, Le/f/c/k/f;->b(Ljava/lang/Class;)Le/f/c/r/a;

    move-result-object v2

    const-class v3, Le/f/c/p/d;

    .line 4
    invoke-interface {p0, v3}, Le/f/c/k/f;->b(Ljava/lang/Class;)Le/f/c/r/a;

    move-result-object v3

    const-class v4, Le/f/c/s/k;

    .line 5
    invoke-interface {p0, v4}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/f/c/s/k;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Le/f/c/h;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V

    return-object v0
.end method

.method public static final synthetic lambda$getComponents$1$Registrar(Le/f/c/k/f;)Le/f/c/q/i0/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/firebase/iid/Registrar$a;

    const-class v1, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-interface {p0, v1}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-direct {v0, p0}, Lcom/google/firebase/iid/Registrar$a;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;)V

    return-object v0
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/f/c/k/e<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 2
    invoke-static {v0}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v1

    const-class v2, Le/f/c/h;

    .line 3
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/v/h;

    .line 4
    invoke-static {v2}, Le/f/c/k/u;->b(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/p/d;

    .line 5
    invoke-static {v2}, Le/f/c/k/u;->b(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/s/k;

    .line 6
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    sget-object v2, Le/f/c/q/s;->a:Le/f/c/k/k;

    .line 7
    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 8
    invoke-virtual {v1}, Le/f/c/k/e$a;->a()Le/f/c/k/e$a;

    .line 9
    invoke-virtual {v1}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v1

    .line 10
    const-class v2, Le/f/c/q/i0/a;

    .line 11
    invoke-static {v2}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v2

    .line 12
    invoke-static {v0}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v0

    invoke-virtual {v2, v0}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    sget-object v0, Le/f/c/q/t;->a:Le/f/c/k/k;

    .line 13
    invoke-virtual {v2, v0}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 14
    invoke-virtual {v2}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "21.0.0"

    .line 15
    invoke-static {v2, v3}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Le/f/c/k/e;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    .line 16
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
