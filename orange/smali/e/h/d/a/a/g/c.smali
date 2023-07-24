.class public final synthetic Le/h/d/a/a/g/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Le/h/d/a/a/g/k;

.field private final synthetic c:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Le/h/d/a/a/g/k;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/g/c;->b:Le/h/d/a/a/g/k;

    iput-object p2, p0, Le/h/d/a/a/g/c;->c:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/h/d/a/a/g/c;->b:Le/h/d/a/a/g/k;

    iget-object v1, p0, Le/h/d/a/a/g/c;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Le/h/d/a/a/g/k;->a(Le/h/d/a/a/g/k;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
