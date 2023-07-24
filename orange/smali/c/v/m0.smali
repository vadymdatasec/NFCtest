.class public Lc/v/m0;
.super Lc/v/l0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/e/b;

.field public final synthetic b:Lc/v/n0;


# direct methods
.method public constructor <init>(Lc/v/n0;Lc/e/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/v/m0;->b:Lc/v/n0;

    iput-object p2, p0, Lc/v/m0;->a:Lc/e/b;

    invoke-direct {p0}, Lc/v/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lc/v/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/v/m0;->a:Lc/e/b;

    iget-object v1, p0, Lc/v/m0;->b:Lc/v/n0;

    iget-object v1, v1, Lc/v/n0;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
