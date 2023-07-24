.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Le/f/c/k/f;)Le/f/c/l/d;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a(Le/f/c/k/f;)Le/f/c/l/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Le/f/c/k/f;)Le/f/c/l/d;
    .locals 4

    .line 1
    const-class v0, Le/f/c/h;

    invoke-interface {p1, v0}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/c/h;

    .line 2
    const-class v1, Le/f/c/l/e/a;

    invoke-interface {p1, v1}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/l/e/a;

    .line 3
    const-class v2, Le/f/c/j/a/c;

    invoke-interface {p1, v2}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/c/j/a/c;

    .line 4
    const-class v3, Le/f/c/s/k;

    invoke-interface {p1, v3}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/c/s/k;

    .line 5
    invoke-static {v0, p1, v1, v2}, Le/f/c/l/d;->a(Le/f/c/h;Le/f/c/s/k;Le/f/c/l/e/a;Le/f/c/j/a/c;)Le/f/c/l/d;

    move-result-object p1

    return-object p1
.end method

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
    const-class v1, Le/f/c/l/d;

    .line 2
    invoke-static {v1}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v1

    const-class v2, Le/f/c/h;

    .line 3
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/s/k;

    .line 4
    invoke-static {v2}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/j/a/c;

    .line 5
    invoke-static {v2}, Le/f/c/k/u;->a(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    const-class v2, Le/f/c/l/e/a;

    .line 6
    invoke-static {v2}, Le/f/c/k/u;->a(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    invoke-static {p0}, Le/f/c/l/b;->a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)Le/f/c/k/k;

    move-result-object v2

    .line 7
    invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 8
    invoke-virtual {v1}, Le/f/c/k/e$a;->c()Le/f/c/k/e$a;

    .line 9
    invoke-virtual {v1}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-cls"

    const-string v2, "17.2.2"

    .line 10
    invoke-static {v1, v2}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
