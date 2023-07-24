.class public Le/f/c/v/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/v/h;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Le/f/c/v/d;


# direct methods
.method public constructor <init>(Ljava/util/Set;Le/f/c/v/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Le/f/c/v/f;",
            ">;",
            "Le/f/c/v/d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/f/c/v/c;->a(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/f/c/v/c;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/f/c/v/c;->b:Le/f/c/v/d;

    return-void
.end method

.method public static synthetic a(Le/f/c/k/f;)Le/f/c/v/h;
    .locals 2

    .line 12
    new-instance v0, Le/f/c/v/c;

    const-class v1, Le/f/c/v/f;

    .line 13
    invoke-interface {p0, v1}, Le/f/c/k/f;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Le/f/c/v/d;->b()Le/f/c/v/d;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Le/f/c/v/c;-><init>(Ljava/util/Set;Le/f/c/v/d;)V

    return-object v0
.end method

.method public static a(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Le/f/c/v/f;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 6
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/v/f;

    .line 8
    invoke-virtual {v1}, Le/f/c/v/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Le/f/c/v/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()Le/f/c/k/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e<",
            "Le/f/c/v/h;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Le/f/c/v/h;

    invoke-static {v0}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v0

    const-class v1, Le/f/c/v/f;

    .line 2
    invoke-static {v1}, Le/f/c/k/u;->d(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    invoke-static {}, Le/f/c/v/b;->a()Le/f/c/k/k;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 4
    invoke-virtual {v0}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/v/c;->b:Le/f/c/v/d;

    invoke-virtual {v0}, Le/f/c/v/d;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/c/v/c;->a:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Le/f/c/v/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/c/v/c;->b:Le/f/c/v/d;

    invoke-virtual {v1}, Le/f/c/v/d;->a()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Le/f/c/v/c;->a(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
