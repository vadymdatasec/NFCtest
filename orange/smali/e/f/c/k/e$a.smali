.class public Le/f/c/k/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/c/k/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/f/c/k/u;",
            ">;"
        }
    .end annotation
.end field

.field public c:I

.field public d:I

.field public e:Le/f/c/k/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/k/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/f/c/k/e$a;->a:Ljava/util/Set;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/f/c/k/e$a;->b:Ljava/util/Set;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Le/f/c/k/e$a;->c:I

    .line 6
    iput v0, p0, Le/f/c/k/e$a;->d:I

    .line 7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Le/f/c/k/e$a;->f:Ljava/util/Set;

    const-string v1, "Null interface"

    .line 8
    invoke-static {p1, v1}, Le/f/c/k/y;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    iget-object v2, p0, Le/f/c/k/e$a;->a:Ljava/util/Set;

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    array-length p1, p2

    :goto_0
    if-ge v0, p1, :cond_0

    aget-object v2, p2, v0

    .line 11
    invoke-static {v2, v1}, Le/f/c/k/y;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Le/f/c/k/e$a;->a:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;Le/f/c/k/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/f/c/k/e$a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic a(Le/f/c/k/e$a;)Le/f/c/k/e$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/c/k/e$a;->d()Le/f/c/k/e$a;

    return-object p0
.end method


# virtual methods
.method public a()Le/f/c/k/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e$a<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Le/f/c/k/e$a;->a(I)Le/f/c/k/e$a;

    return-object p0
.end method

.method public final a(I)Le/f/c/k/e$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Le/f/c/k/e$a<",
            "TT;>;"
        }
    .end annotation

    .line 6
    iget v0, p0, Le/f/c/k/e$a;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Instantiation type has already been set."

    invoke-static {v0, v1}, Le/f/c/k/y;->b(ZLjava/lang/String;)V

    .line 7
    iput p1, p0, Le/f/c/k/e$a;->c:I

    return-object p0
.end method

.method public a(Le/f/c/k/k;)Le/f/c/k/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/k/k<",
            "TT;>;)",
            "Le/f/c/k/e$a<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "Null factory"

    .line 11
    invoke-static {p1, v0}, Le/f/c/k/y;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Le/f/c/k/k;

    iput-object p1, p0, Le/f/c/k/e$a;->e:Le/f/c/k/k;

    return-object p0
.end method

.method public a(Le/f/c/k/u;)Le/f/c/k/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/k/u;",
            ")",
            "Le/f/c/k/e$a<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "Null dependency"

    .line 2
    invoke-static {p1, v0}, Le/f/c/k/y;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, Le/f/c/k/u;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/f/c/k/e$a;->a(Ljava/lang/Class;)V

    .line 4
    iget-object v0, p0, Le/f/c/k/e$a;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Le/f/c/k/e$a;->a:Ljava/util/Set;

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string v0, "Components are not allowed to depend on interfaces they themselves provide."

    .line 10
    invoke-static {p1, v0}, Le/f/c/k/y;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public b()Le/f/c/k/e;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/k/e$a;->e:Le/f/c/k/k;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Missing required property: factory."

    invoke-static {v0, v1}, Le/f/c/k/y;->b(ZLjava/lang/String;)V

    .line 2
    new-instance v0, Le/f/c/k/e;

    new-instance v3, Ljava/util/HashSet;

    iget-object v1, p0, Le/f/c/k/e$a;->a:Ljava/util/Set;

    invoke-direct {v3, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/HashSet;

    iget-object v1, p0, Le/f/c/k/e$a;->b:Ljava/util/Set;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget v5, p0, Le/f/c/k/e$a;->c:I

    iget v6, p0, Le/f/c/k/e$a;->d:I

    iget-object v7, p0, Le/f/c/k/e$a;->e:Le/f/c/k/k;

    iget-object v8, p0, Le/f/c/k/e$a;->f:Ljava/util/Set;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Le/f/c/k/e;-><init>(Ljava/util/Set;Ljava/util/Set;IILe/f/c/k/k;Ljava/util/Set;Le/f/c/k/d;)V

    return-object v0
.end method

.method public c()Le/f/c/k/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e$a<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Le/f/c/k/e$a;->a(I)Le/f/c/k/e$a;

    return-object p0
.end method

.method public final d()Le/f/c/k/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e$a<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Le/f/c/k/e$a;->d:I

    return-object p0
.end method
