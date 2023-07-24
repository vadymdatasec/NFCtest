.class public Lc/h/k/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Lc/h/k/o;


# direct methods
.method public constructor <init>(I[Lc/h/k/o;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/h/k/n;->a:I

    .line 3
    iput-object p2, p0, Lc/h/k/n;->b:[Lc/h/k/o;

    return-void
.end method

.method public static a(I[Lc/h/k/o;)Lc/h/k/n;
    .locals 1

    .line 2
    new-instance v0, Lc/h/k/n;

    invoke-direct {v0, p0, p1}, Lc/h/k/n;-><init>(I[Lc/h/k/o;)V

    return-object v0
.end method


# virtual methods
.method public a()[Lc/h/k/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/k/n;->b:[Lc/h/k/o;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lc/h/k/n;->a:I

    return v0
.end method
