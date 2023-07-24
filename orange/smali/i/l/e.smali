.class public final Li/l/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/k/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/k/a<",
        "Li/i/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:Li/h/b/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/h/b/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Li/d<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILi/h/b/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Li/h/b/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Li/d<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/l/e;->a:Ljava/lang/CharSequence;

    iput p2, p0, Li/l/e;->b:I

    iput p3, p0, Li/l/e;->c:I

    iput-object p4, p0, Li/l/e;->d:Li/h/b/p;

    return-void
.end method

.method public static final synthetic a(Li/l/e;)Li/h/b/p;
    .locals 0

    .line 1
    iget-object p0, p0, Li/l/e;->d:Li/h/b/p;

    return-object p0
.end method

.method public static final synthetic b(Li/l/e;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Li/l/e;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(Li/l/e;)I
    .locals 0

    .line 1
    iget p0, p0, Li/l/e;->c:I

    return p0
.end method

.method public static final synthetic d(Li/l/e;)I
    .locals 0

    .line 1
    iget p0, p0, Li/l/e;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Li/i/e;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Li/l/d;

    invoke-direct {v0, p0}, Li/l/d;-><init>(Li/l/e;)V

    return-object v0
.end method
