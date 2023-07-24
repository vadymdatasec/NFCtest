.class public Lc/f/a/l/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc/f/a/l/g;

.field public b:Lc/f/a/l/g;

.field public c:I

.field public d:Lc/f/a/l/g$a;

.field public e:I


# direct methods
.method public constructor <init>(Lc/f/a/l/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    .line 3
    invoke-virtual {p1}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v0

    iput-object v0, p0, Lc/f/a/l/t;->b:Lc/f/a/l/g;

    .line 4
    invoke-virtual {p1}, Lc/f/a/l/g;->b()I

    move-result v0

    iput v0, p0, Lc/f/a/l/t;->c:I

    .line 5
    invoke-virtual {p1}, Lc/f/a/l/g;->f()Lc/f/a/l/g$a;

    move-result-object v0

    iput-object v0, p0, Lc/f/a/l/t;->d:Lc/f/a/l/g$a;

    .line 6
    invoke-virtual {p1}, Lc/f/a/l/g;->a()I

    move-result p1

    iput p1, p0, Lc/f/a/l/t;->e:I

    return-void
.end method


# virtual methods
.method public a(Lc/f/a/l/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    invoke-virtual {v0}, Lc/f/a/l/g;->h()Lc/f/a/l/g$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lc/f/a/l/t;->b:Lc/f/a/l/g;

    iget v1, p0, Lc/f/a/l/t;->c:I

    iget-object v2, p0, Lc/f/a/l/t;->d:Lc/f/a/l/g$a;

    iget v3, p0, Lc/f/a/l/t;->e:I

    invoke-virtual {p1, v0, v1, v2, v3}, Lc/f/a/l/g;->a(Lc/f/a/l/g;ILc/f/a/l/g$a;I)Z

    return-void
.end method

.method public b(Lc/f/a/l/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    invoke-virtual {v0}, Lc/f/a/l/g;->h()Lc/f/a/l/g$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object p1

    iput-object p1, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object p1

    iput-object p1, p0, Lc/f/a/l/t;->b:Lc/f/a/l/g;

    .line 3
    iget-object p1, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    invoke-virtual {p1}, Lc/f/a/l/g;->b()I

    move-result p1

    iput p1, p0, Lc/f/a/l/t;->c:I

    .line 4
    iget-object p1, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    invoke-virtual {p1}, Lc/f/a/l/g;->f()Lc/f/a/l/g$a;

    move-result-object p1

    iput-object p1, p0, Lc/f/a/l/t;->d:Lc/f/a/l/g$a;

    .line 5
    iget-object p1, p0, Lc/f/a/l/t;->a:Lc/f/a/l/g;

    invoke-virtual {p1}, Lc/f/a/l/g;->a()I

    move-result p1

    iput p1, p0, Lc/f/a/l/t;->e:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lc/f/a/l/t;->b:Lc/f/a/l/g;

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lc/f/a/l/t;->c:I

    .line 8
    sget-object v0, Lc/f/a/l/g$a;->c:Lc/f/a/l/g$a;

    iput-object v0, p0, Lc/f/a/l/t;->d:Lc/f/a/l/g$a;

    .line 9
    iput p1, p0, Lc/f/a/l/t;->e:I

    :goto_0
    return-void
.end method
