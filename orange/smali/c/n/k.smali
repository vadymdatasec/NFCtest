.class public Lc/n/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc/n/g$b;

.field public b:Lc/n/h;


# direct methods
.method public constructor <init>(Lc/n/i;Lc/n/g$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lc/n/m;->a(Ljava/lang/Object;)Lc/n/h;

    move-result-object p1

    iput-object p1, p0, Lc/n/k;->b:Lc/n/h;

    .line 3
    iput-object p2, p0, Lc/n/k;->a:Lc/n/g$b;

    return-void
.end method


# virtual methods
.method public a(Lc/n/j;Lc/n/g$a;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lc/n/g$a;->a()Lc/n/g$b;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/n/k;->a:Lc/n/g$b;

    invoke-static {v1, v0}, Lc/n/l;->a(Lc/n/g$b;Lc/n/g$b;)Lc/n/g$b;

    move-result-object v1

    iput-object v1, p0, Lc/n/k;->a:Lc/n/g$b;

    .line 3
    iget-object v1, p0, Lc/n/k;->b:Lc/n/h;

    invoke-interface {v1, p1, p2}, Lc/n/h;->a(Lc/n/j;Lc/n/g$a;)V

    .line 4
    iput-object v0, p0, Lc/n/k;->a:Lc/n/g$b;

    return-void
.end method
