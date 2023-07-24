.class public Lk/e1/k/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/net/Socket;

.field public b:Ljava/lang/String;

.field public c:Ll/h;

.field public d:Ll/g;

.field public e:Lk/e1/k/r;

.field public f:Lk/e1/k/j0;

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lk/e1/k/r;->a:Lk/e1/k/r;

    iput-object v0, p0, Lk/e1/k/p;->e:Lk/e1/k/r;

    .line 3
    sget-object v0, Lk/e1/k/j0;->a:Lk/e1/k/j0;

    iput-object v0, p0, Lk/e1/k/p;->f:Lk/e1/k/j0;

    .line 4
    iput-boolean p1, p0, Lk/e1/k/p;->g:Z

    return-void
.end method


# virtual methods
.method public a(I)Lk/e1/k/p;
    .locals 0

    .line 6
    iput p1, p0, Lk/e1/k/p;->h:I

    return-object p0
.end method

.method public a(Ljava/net/Socket;Ljava/lang/String;Ll/h;Ll/g;)Lk/e1/k/p;
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/p;->a:Ljava/net/Socket;

    .line 2
    iput-object p2, p0, Lk/e1/k/p;->b:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lk/e1/k/p;->c:Ll/h;

    .line 4
    iput-object p4, p0, Lk/e1/k/p;->d:Ll/g;

    return-object p0
.end method

.method public a(Lk/e1/k/r;)Lk/e1/k/p;
    .locals 0

    .line 5
    iput-object p1, p0, Lk/e1/k/p;->e:Lk/e1/k/r;

    return-object p0
.end method

.method public a()Lk/e1/k/x;
    .locals 1

    .line 7
    new-instance v0, Lk/e1/k/x;

    invoke-direct {v0, p0}, Lk/e1/k/x;-><init>(Lk/e1/k/p;)V

    return-object v0
.end method
