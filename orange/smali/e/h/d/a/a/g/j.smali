.class public Le/h/d/a/a/g/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/h/d/a/a/g/k;


# direct methods
.method public constructor <init>(Le/h/d/a/a/g/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/g/j;->b:Le/h/d/a/a/g/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/h/d/a/a/g/k;Le/h/d/a/a/g/i;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Le/h/d/a/a/g/j;-><init>(Le/h/d/a/a/g/k;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/j;->b:Le/h/d/a/a/g/k;

    invoke-static {v0}, Le/h/d/a/a/g/k;->a(Le/h/d/a/a/g/k;)Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/h/d/a/a/g/j;->b:Le/h/d/a/a/g/k;

    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Le/h/d/a/a/g/k;->a(Le/h/d/a/a/g/k;Ljava/util/Date;)Ljava/util/Date;

    .line 3
    iget-object v0, p0, Le/h/d/a/a/g/j;->b:Le/h/d/a/a/g/k;

    invoke-static {v0}, Le/h/d/a/a/g/k;->b(Le/h/d/a/a/g/k;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    sget-object v2, Lcom/orange/business/packid/android/lib/TransactionErrorType;->GATT_TIMEOUT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v3, 0x1

    const-string v4, "GATT server timeout"

    invoke-virtual {v0, v1, v4, v3, v2}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    .line 4
    iget-object v0, p0, Le/h/d/a/a/g/j;->b:Le/h/d/a/a/g/k;

    invoke-static {v0}, Le/h/d/a/a/g/k;->b(Le/h/d/a/a/g/k;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    :cond_0
    return-void
.end method
