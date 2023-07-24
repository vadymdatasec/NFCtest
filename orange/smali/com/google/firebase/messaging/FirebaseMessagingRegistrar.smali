.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/l;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$b;,
        Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static determineFactory(Le/f/a/a/g;)Le/f/a/a/g;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    sget-object v0, Le/f/a/a/i/a;->g:Le/f/a/a/i/a;

    .line 2
    invoke-virtual {v0}, Le/f/a/a/i/a;->b()Ljava/util/Set;

    move-result-object v0

    const-string v1, "json"

    invoke-static {v1}, Le/f/a/a/b;->a(Ljava/lang/String;)Le/f/a/a/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    .line 3
    :cond_1
    :goto_0
    new-instance p0, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$c;

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$c;-><init>()V

    return-object p0
.end method

.method public static final synthetic lambda$getComponents$0$FirebaseMessagingRegistrar(Le/f/c/k/f;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    .line 1
    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v0, Le/f/c/h;

    .line 2
    invoke-interface {p0, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le/f/c/h;

    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 3
    invoke-interface {p0, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v0, Le/f/c/v/h;

    .line 4
    invoke-interface {p0, v0}, Le/f/c/k/f;->b(Ljava/lang/Class;)Le/f/c/r/a;

    move-result-object v3

    const-class v0, Le/f/c/p/d;

    .line 5
    invoke-interface {p0, v0}, Le/f/c/k/f;->b(Ljava/lang/Class;)Le/f/c/r/a;

    move-result-object v4

    const-class v0, Le/f/c/s/k;

    .line 6
    invoke-interface {p0, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le/f/c/s/k;

    const-class v0, Le/f/a/a/g;

    .line 7
    invoke-interface {p0, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/a/g;

    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->determineFactory(Le/f/a/a/g;)Le/f/a/a/g;

    move-result-object v6

    const-class v0, Le/f/c/o/d;

    .line 8
    invoke-interface {p0, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Le/f/c/o/d;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Le/f/c/h;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;Le/f/a/a/g;Le/f/c/o/d;)V

    return-object v8
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
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

    const/4 v0, 0x2

    new-array v0, v0, [Le/f/c/k/e;

    .line 1
    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    invoke-static {v1}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v1

    const-class v2, Le/f/c/h;

    .line 3
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 4
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/v/h;

    .line 5
    invoke-static {v2}, Le/f/c/k/u;->b(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/p/d;

    .line 6
    invoke-static {v2}, Le/f/c/k/u;->b(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/a/a/g;

    .line 7
    invoke-static {v2}, Le/f/c/k/u;->a(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/s/k;

    .line 8
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/o/d;

    .line 9
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    sget-object v2, Le/f/c/u/r;->a:Le/f/c/k/k;

    .line 10
    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 11
    invoke-virtual {v1}, Le/f/c/k/e$a;->a()Le/f/c/k/e$a;

    .line 12
    invoke-virtual {v1}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-fcm"

    const-string v2, "20.1.7_1p"

    .line 13
    invoke-static {v1, v2}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 14
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
