From Source
First you'll want to clone the repository:

git clone https://github.com/libfann/fann.git

Once that's finished, navigate to the Root directory. In this case it would be ./fann:

cd ./fann
need install cmake
Then run CMake

cmake .

After that, you'll need to use elevated privileges to install the library:

sudo make install

sudo ldconfig
