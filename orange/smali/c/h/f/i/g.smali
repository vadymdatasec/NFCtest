.class public final Lc/h/f/i/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IZLjava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/h/f/i/g;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lc/h/f/i/g;->b:I

    .line 4
    iput-boolean p3, p0, Lc/h/f/i/g;->c:Z

    .line 5
    iput-object p4, p0, Lc/h/f/i/g;->d:Ljava/lang/String;

    .line 6
    iput p5, p0, Lc/h/f/i/g;->e:I

    .line 7
    iput p6, p0, Lc/h/f/i/g;->f:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/f/i/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lc/h/f/i/g;->f:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lc/h/f/i/g;->e:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/f/i/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lc/h/f/i/g;->b:I

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/h/f/i/g;->c:Z

    return v0
.end method
