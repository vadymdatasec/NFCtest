.class public abstract Lm/b/k/e;
.super Lm/b/k/q0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lm/b/k/q0;",
            ">;"
        }
    .end annotation
.end field

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm/b/k/q0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm/b/k/e;->b:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lm/b/k/q0;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Lm/b/k/e;-><init>()V

    .line 5
    iget-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 6
    invoke-virtual {p0}, Lm/b/k/e;->b()V

    return-void
.end method


# virtual methods
.method public a()Lm/b/k/q0;
    .locals 2

    .line 1
    iget v0, p0, Lm/b/k/e;->b:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/k/q0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public a(Lm/b/k/q0;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    iget v1, p0, Lm/b/k/e;->b:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lm/b/k/e;->b:I

    return-void
.end method
