.class public final Lc/h/f/i/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/f/i/e;


# instance fields
.field public final a:Lc/h/k/g;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc/h/k/g;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/h/f/i/h;->a:Lc/h/k/g;

    .line 3
    iput p2, p0, Lc/h/f/i/h;->c:I

    .line 4
    iput p3, p0, Lc/h/f/i/h;->b:I

    .line 5
    iput-object p4, p0, Lc/h/f/i/h;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lc/h/f/i/h;->c:I

    return v0
.end method

.method public b()Lc/h/k/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/f/i/h;->a:Lc/h/k/g;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/f/i/h;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lc/h/f/i/h;->b:I

    return v0
.end method
