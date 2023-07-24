.class public Le/f/a/a/j/j0/j/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/f/a/a/j/l0/a;

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/f/a/a/d;",
            "Le/f/a/a/j/j0/j/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/f/a/a/j/j0/j/i;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Le/f/a/a/d;Le/f/a/a/j/j0/j/k;)Le/f/a/a/j/j0/j/i;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/a/a/j/j0/j/i;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/i;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/a/j/j0/j/i;->a:Le/f/a/a/j/l0/a;

    return-object p0
.end method

.method public a()Le/f/a/a/j/j0/j/m;
    .locals 2

    .line 3
    iget-object v0, p0, Le/f/a/a/j/j0/j/i;->a:Le/f/a/a/j/l0/a;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Le/f/a/a/j/j0/j/i;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-static {}, Le/f/a/a/d;->values()[Le/f/a/a/d;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 5
    iget-object v0, p0, Le/f/a/a/j/j0/j/i;->b:Ljava/util/Map;

    .line 6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Le/f/a/a/j/j0/j/i;->b:Ljava/util/Map;

    .line 7
    iget-object v1, p0, Le/f/a/a/j/j0/j/i;->a:Le/f/a/a/j/l0/a;

    invoke-static {v1, v0}, Le/f/a/a/j/j0/j/m;->a(Le/f/a/a/j/l0/a;Ljava/util/Map;)Le/f/a/a/j/j0/j/m;

    move-result-object v0

    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not all priorities have been configured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "missing required property: clock"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
