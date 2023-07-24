.class public final Le/f/b/b/k0;
.super Le/f/b/b/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/u<",
        "TK;TV;",
        "Le/f/b/b/j0<",
        "TK;TV;>;",
        "Le/f/b/b/k0<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final i:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final j:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/b/b/q;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/q<",
            "TK;TV;",
            "Le/f/b/b/j0<",
            "TK;TV;>;",
            "Le/f/b/b/k0<",
            "TK;TV;>;>;II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/b/b/u;-><init>(Le/f/b/b/q;II)V

    .line 2
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Le/f/b/b/k0;->i:Ljava/lang/ref/ReferenceQueue;

    .line 3
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Le/f/b/b/k0;->j:Ljava/lang/ref/ReferenceQueue;

    return-void
.end method

.method public static synthetic a(Le/f/b/b/k0;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/b/b/k0;->i:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method

.method public static synthetic b(Le/f/b/b/k0;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/b/b/k0;->j:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/k0;->i:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, Le/f/b/b/u;->a(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/k0;->i:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, Le/f/b/b/u;->b(Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    iget-object v0, p0, Le/f/b/b/k0;->j:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, Le/f/b/b/u;->c(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method public i()Le/f/b/b/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/k0<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public bridge synthetic i()Le/f/b/b/u;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/b/b/k0;->i()Le/f/b/b/k0;

    return-object p0
.end method
