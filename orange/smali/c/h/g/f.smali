.class public Lc/h/g/f;
.super Lc/h/k/p;
.source "SourceFile"


# instance fields
.field public a:Lc/h/f/i/r;


# direct methods
.method public constructor <init>(Lc/h/f/i/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/h/k/p;-><init>()V

    .line 2
    iput-object p1, p0, Lc/h/g/f;->a:Lc/h/f/i/r;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lc/h/g/f;->a:Lc/h/f/i/r;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lc/h/f/i/r;->a(I)V

    :cond_0
    return-void
.end method

.method public a(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/g/f;->a:Lc/h/f/i/r;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/h/f/i/r;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
