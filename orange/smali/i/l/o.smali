.class public final Li/l/o;
.super Li/h/c/l;
.source "SourceFile"

# interfaces
.implements Li/h/b/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li/h/c/l;",
        "Li/h/b/p<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "Li/d<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Z)V
    .locals 0

    iput-object p1, p0, Li/l/o;->b:Ljava/util/List;

    iput-boolean p2, p0, Li/l/o;->c:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Li/h/c/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)Li/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Li/d<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Li/l/o;->b:Ljava/util/List;

    iget-boolean v1, p0, Li/l/o;->c:Z

    const/4 v2, 0x0

    invoke-static {p1, v0, p2, v1, v2}, Li/l/p;->a(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Li/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li/d;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Li/d;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Li/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Li/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Li/l/o;->a(Ljava/lang/CharSequence;I)Li/d;

    move-result-object p1

    return-object p1
.end method
