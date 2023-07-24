.class public final Le/f/e/r/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[I


# instance fields
.field public final a:Le/f/e/r/m;

.field public final b:Le/f/e/r/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Le/f/e/r/o;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/e/r/m;

    invoke-direct {v0}, Le/f/e/r/m;-><init>()V

    iput-object v0, p0, Le/f/e/r/o;->a:Le/f/e/r/m;

    .line 3
    new-instance v0, Le/f/e/r/n;

    invoke-direct {v0}, Le/f/e/r/n;-><init>()V

    iput-object v0, p0, Le/f/e/r/o;->b:Le/f/e/r/n;

    return-void
.end method


# virtual methods
.method public a(ILe/f/e/o/a;I)Le/f/e/j;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/e/r/o;->c:[I

    const/4 v1, 0x0

    invoke-static {p2, p3, v1, v0}, Le/f/e/r/p;->a(Le/f/e/o/a;IZ[I)[I

    move-result-object p3

    .line 2
    :try_start_0
    iget-object v0, p0, Le/f/e/r/o;->b:Le/f/e/r/n;

    invoke-virtual {v0, p1, p2, p3}, Le/f/e/r/n;->a(ILe/f/e/o/a;[I)Le/f/e/j;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/zxing/ReaderException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 3
    :catch_0
    iget-object v0, p0, Le/f/e/r/o;->a:Le/f/e/r/m;

    invoke-virtual {v0, p1, p2, p3}, Le/f/e/r/m;->a(ILe/f/e/o/a;[I)Le/f/e/j;

    move-result-object p1

    return-object p1
.end method
